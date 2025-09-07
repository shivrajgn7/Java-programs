package com.android.store;

import com.android.store.appValidate.PlayStore;
import com.android.store.appValidate.PlayStore;
import com.android.store.application.Application;
import com.android.store.validation.Validation;

public class StoreRunner {
    public static void main(String[] args) {
        Application application=new Application();
        application.setVersion("34567V");
        application.setAppName("");
        application.setDownloads(2345678);
        application.setUpdateOn("12/6/2025");
        application.setRequiredOs("Android,mac");
        application.setReleaseOn("23/04/2016");

        PlayStore  playStore=new PlayStore();
        playStore.addApplication(application);
        playStore.getInfo();


    }
}
