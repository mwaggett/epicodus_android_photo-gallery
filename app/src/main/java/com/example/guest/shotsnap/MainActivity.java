package com.example.guest.shotsnap;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface vit = Typeface.createFromAsset(getAssets(),"fonts/vitreous_medium.ttf");
        TextView titleLabel = (TextView)findViewById(R.id.titleLabel);
        titleLabel.setTypeface(vit);
    }

}
