package com.xxj.mvvm.demo.android_mvvm_demo;

import android.app.Application;
import android.content.Context;

/**
 * Created by 52492 on 05/18.
 */

public class Utils {
    private static Context context;

    public static void init(Application context){
        Utils.context = context;
    }

    public static Context getContext() {
        return context;
    }
}
