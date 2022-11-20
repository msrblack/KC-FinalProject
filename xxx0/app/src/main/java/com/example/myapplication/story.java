package com.example.myapplication;

import android.widget.ImageView;

public class story {
    private int setimag;
    private String setName;
    private String setstory;
    private String setdet;

    public story(int setimag, String setName, String setstory, String setdet) {
        this.setimag = setimag;
        this.setName = setName;
        this.setstory = setstory;
        this.setdet = setdet;
    }

    public int getSetimag() {
        return setimag;
    }

    public void setSetimag(int setimag) {
        this.setimag = setimag;
    }

    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    public String getSetstory() {
        return setstory;
    }

    public void setSetstory(String setstory) {
        this.setstory = setstory;
    }

    public String getSetdet() {
        return setdet;
    }

    public void setSetdet(String setdet) {
        this.setdet = setdet;
    }
}
