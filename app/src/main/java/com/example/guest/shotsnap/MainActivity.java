package com.example.guest.shotsnap;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mNextButton;
    private Button mPreviousButton;
    private ImageView mImage;
    private TextView mDescription;

    private PhotoLib mPhotoLib;
    private Photo mCurrentPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface vit = Typeface.createFromAsset(getAssets(),"fonts/vitreous_medium.ttf");
        TextView titleLabel = (TextView)findViewById(R.id.titleLabel);
        titleLabel.setTypeface(vit);

        mNextButton = (Button) findViewById(R.id.nextButton);
        mPreviousButton = (Button) findViewById(R.id.previousButton);
        mImage = (ImageView) findViewById(R.id.currentImage);
        mDescription = (TextView) findViewById(R.id.imageDescription);

        mPhotoLib = new PhotoLib();
        mCurrentPhoto = mPhotoLib.getPhotos().get(0);

        setLayoutContent();

        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentPhoto = mPhotoLib.nextPhoto(mCurrentPhoto);
                setLayoutContent();
            }
        });

        mPreviousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentPhoto = mPhotoLib.previousPhoto(mCurrentPhoto);
                setLayoutContent();
            }
        });
    }

    private void setLayoutContent() {
        mImage.setImageResource(mCurrentPhoto.getSrc());
        mDescription.setText(mCurrentPhoto.getDescription());
    }

}
