package com.example.guest.shotsnap;

public class Photo {

    private int mSrc;
    private String mDescription;

    public Photo(int src, String description) {
        mSrc = src;
        mDescription = description;
    }

    public int getSrc() {
        return mSrc;
    }

    public void setSrc(int src) {
        mSrc = src;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
