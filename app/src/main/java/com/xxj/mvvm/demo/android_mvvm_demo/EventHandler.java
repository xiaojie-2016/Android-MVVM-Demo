package com.xxj.mvvm.demo.android_mvvm_demo;

import android.graphics.Color;
import android.view.View;
import android.widget.Toast;

import com.xxj.mvvm.demo.android_mvvm_demo.bean.User2;
import com.xxj.mvvm.demo.android_mvvm_demo.utils.Utils;

/**
 * 事件绑定类
 * Created by xxj on 05/18.
 */

public class EventHandler {

    public void onUserClick(View view) {
        Toast.makeText(Utils.getContext(), "User is click ！", Toast.LENGTH_LONG).show();
    }

    /**
     * 如果点击事件你想知道到底谁点了
     *
     * @param user User
     */
    public void onUserClick1(User user){
        Toast.makeText(Utils.getContext(), "User is click ！"+user.getName(), Toast.LENGTH_LONG).show();
    }

    public void onUserClick2(View view, User user){
        view.setBackgroundColor(Color.BLUE);
        Toast.makeText(Utils.getContext(), "User is click ！"+user.getName(), Toast.LENGTH_LONG).show();
    }

    public void changeName(User2 user2, String name){
        user2.name.set(name);
    }

}
