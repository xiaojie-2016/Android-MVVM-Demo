package com.xxj.mvvm.demo.android_mvvm_demo.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.xxj.mvvm.demo.android_mvvm_demo.BR;

/**
 * Created by xxj on 04/05.
 */

public class User3 extends BaseObservable{
    private String name;
    private int age;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }
}
