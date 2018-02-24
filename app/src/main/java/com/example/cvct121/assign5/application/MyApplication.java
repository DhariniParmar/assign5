package com.example.cvct121.assign5.application;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowConfig;
import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by CVCT121 on 2/23/2018.
 */



    public class MyApplication extends Application
    {
        @Override
        public void onCreate() {
            super.onCreate();
            // This instantiates DBFlow
            FlowManager.init(new FlowConfig.Builder(this).build());
            // add for verbose logging
            // FlowLog.setMinimumLoggingLevel(FlowLog.Level.V);
        }
    }

