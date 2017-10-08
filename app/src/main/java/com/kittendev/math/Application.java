package com.kittendev.math;

import com.kittendev.math.handler.CrashHandler;

public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        new CrashHandler().initialize(this);
    }
}
