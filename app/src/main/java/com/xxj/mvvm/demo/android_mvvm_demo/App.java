package com.xxj.mvvm.demo.android_mvvm_demo;

import android.app.Application;

/**
 * Created by 52492 on 05/18.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
    }
}
