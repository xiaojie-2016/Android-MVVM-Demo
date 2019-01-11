package com.xxj.mvvm.demo.android_mvvm_demo.bean;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;

import com.xxj.mvvm.demo.android_mvvm_demo.BR;

/**
 * Created by xxj on 04/05.
 */

public class User3 extends BaseObservable {
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

    /**
     * “@Bindable” 注解的方法必须是 public
     * “@Bindable” 注解也可以添加一组参数的，这样的话 name 或者 age 发生变化的时候都会通知 getNameAndAge 方法
     * 需要注意的是这样做并不等同于 notifyPropertyChanged(BR.nameAndAge); {@link OnPropertyChangedCallback#onPropertyChanged(Observable, int)} 并不会被调用
     * 大家可点进源码看注释
     * 那个 onPropertyChanged 方法现在显然没什么用，但是以后不保证你会用它来实现什么骚操作，比如来实现 EventBus
     */
    @Bindable({"name", "age"})
    public String getNameAndAge() {
        return name + age;
    }
}
