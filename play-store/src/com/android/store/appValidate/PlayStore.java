package com.android.store.appValidate;

import com.android.store.validation.Validation;
import com.android.store.application.Application;
public class PlayStore {
    Application application;
    public boolean addApplication(Application application) {
        //Application application=new Application();
        boolean isAdded = false;
        Validation validation = new Validation();
        boolean isValidate = false;
        isValidate = validation.validate(application);

      if(isValidate){
          this.application = application;
          isAdded = true;

      }
    return isAdded;
    }


    public  void getInfo(){
        System.out.println("Application version: "+application.getVersion());
        System.out.println("Application Name: "+application.getAppName());
        System.out.println("Application update on : "+application.getUpdateOn());
        System.out.println("Downloads: "+application.getDownloads());
        System.out.println("App required: "+application.getRequiredOs());
        System.out.println("App Release on : "+application.getReleaseOn());
        System.out.println(" App Created!!!!");


    }
}
