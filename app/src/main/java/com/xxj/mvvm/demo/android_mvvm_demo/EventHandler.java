package com.xxj.mvvm.demo.android_mvvm_demo;

import android.view.View;
import android.widget.Toast;

/**
 * 事件绑定类
 * Created by xxj on 05/18.
 */

public class EventHandler {

    public void onUserClick(View view) {
        Toast.makeText(Utils.getContext(), "User is click ！", Toast.LENGTH_LONG).show();
    }
}
