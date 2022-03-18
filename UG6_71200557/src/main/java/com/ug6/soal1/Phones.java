package com.ug6.soal1;

public class Phones {
    private String phoneName;
    private String phoneCode;
    private String companyCode;
    private String androidCode;
    private int ramCapacity = 0;
    private int romCapacity = 0;
    private int cameraResolution = 0;
    private float screenSize;

    public String getPhoneName() {
        return this.phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getCompanyCode() {
        return this.companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getAndroidCode() {
        return this.androidCode;
    }

    public void setAndroidCode(String androidCode) {
        this.androidCode = androidCode;
    }

    public int getRamCapacity() {
        return this.ramCapacity;
    }

    public void setRamCapacity(int ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public int getRomCapacity() {
        return this.romCapacity;
    }

    public void setRomCapacity(int romCapacity) {
        this.romCapacity = romCapacity;
    }

    public int getCameraResolution() {
        return this.cameraResolution;
    }

    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    public float getScreenSize() {
        return this.screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    public String getPhoneCode() {
        return this.phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }
    public Phones(String phoneName, String phoneCode, String companyCode, String androidCode, int ramCapacity, int romCapacity, int cameraResolution, float screenSize) {
        this.setRomCapacity(romCapacity);
        this.setPhoneCode(phoneCode);
        this.setScreenSize(screenSize);
        this.setAndroidCode(androidCode);
        this.setPhoneName(phoneName);
        this.setCameraResolution(cameraResolution);
        this.setCompanyCode(companyCode);
        this.setRamCapacity(ramCapacity);
    }
    public Phones(String phoneName, String phoneCode, String companyCode, String androidCode) {
        this.setCompanyCode(companyCode);
        this.setPhoneCode(phoneCode);
        this.setAndroidCode(androidCode);
        this.setPhoneName(phoneName);
    }
}