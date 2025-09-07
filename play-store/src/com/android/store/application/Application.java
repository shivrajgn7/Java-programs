package com.android.store.application;

import com.android.store.appValidate.PlayStore;

public class Application {
    private String version;
    private  String appName;
    private String updateOn;
    private long downloads;
    private String requiredOs;
    private String releaseOn;

    public String getVersion(){
        return  version;

    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getUpdateOn() {
        return updateOn;
    }

    public void setUpdateOn(String updateOn) {
        this.updateOn = updateOn;
    }

    public long getDownloads() {
        return downloads;
    }

    public void setDownloads(long downloads) {
        this.downloads = downloads;
    }

    public String getRequiredOs() {
        return requiredOs;
    }

    public void setRequiredOs(String requiredOs) {
        this.requiredOs = requiredOs;
    }

    public String getReleaseOn() {
        return releaseOn;
    }

    public void setReleaseOn(String releaseOn) {
        this.releaseOn = releaseOn;
    }
   /* public  boolean value(){


    AppValidate appValidate=new AppValidate();
        appValidate.val(application);

        }*/

}
