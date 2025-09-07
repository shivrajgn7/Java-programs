package com.android.store.validation;

import com.android.store.application.Application;

public class Validation {

Application application;
    public boolean validate(Application application){

        boolean isValid=false;
        boolean isVersion=false;
        boolean isAppName=false;
        boolean isUpdateOn=false;
        boolean isDownloads=false;
        boolean isRequiredon=false;
        boolean isReleaseOn=false;

        if(application.getVersion()!=null&&!application.getVersion().isEmpty()){
            isVersion=true;
        }else{
            System.out.println("Invalid Version");
        }
        if(application.getAppName()!=null&&!application.getAppName().isEmpty()){
            isAppName=true;
        }else{
            System.out.println("Invalid AppName");
        }
        if(application.getUpdateOn()!=null &&!application.getUpdateOn().isEmpty()){
            isUpdateOn=true;
        }else{
            System.out.println("Invalid update on date");
        }
        if(application.getDownloads()>0){
            isDownloads=true;
        }else{
            System.out.println("Invalid Download number");
        }
        if(application.getRequiredOs()!=null&&!application.getRequiredOs().isEmpty()){
            isRequiredon=true;
        }else{
            System.out.println("Invalid Required");
        }
        if(application.getReleaseOn()!=null&&!application.getReleaseOn().isEmpty()){
            isReleaseOn=true;
        }else{
            System.out.println("Invalid Release on");
        }
        if(isVersion&&isAppName&&isUpdateOn&&isDownloads&&isRequiredon&&isReleaseOn){
            isValid=true;
        }

        return isValid;
    }




}
