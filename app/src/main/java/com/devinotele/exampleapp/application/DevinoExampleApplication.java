package com.devinotele.exampleapp.application;

import android.app.Application;

import com.devinotele.devinosdk.sdk.DevinoSdk;
import com.devinotele.exampleapp.BuildConfig;
import com.google.firebase.messaging.FirebaseMessaging;

public class DevinoExampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseMessaging fb = FirebaseMessaging.getInstance();
        String appId = BuildConfig.DEVINO_APP_ID;

        DevinoSdk.Builder builder = new DevinoSdk.Builder(this, BuildConfig.DEVINO_API_KEY, appId, fb);
        builder.build();

    }
}
