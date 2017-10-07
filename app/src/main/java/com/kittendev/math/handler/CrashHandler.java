package com.kittendev.math.handler;

import android.content.Context;
import android.widget.Toast;

public class CrashHandler implements Thread.UncaughtExceptionHandler {

    private Context context;

    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {
        handleException(throwable);
    }

    public void initialize(Context context) {
        this.context = context;
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    private void handleException(Throwable throwable) {
        Toast.makeText(context, throwable.toString(), Toast.LENGTH_LONG).show();


    }
}