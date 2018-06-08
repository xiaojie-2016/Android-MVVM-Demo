package com.xxj.mvvm.demo.android_mvvm_demo.bean;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * 为了使用可观察的变量，我们新建了一个 User2
 * Created by 52492 on 06/08.
 */

public class User2 {
    //这里同样有两个个属性，不同的是它使用 ObservableField
    public final ObservableField<String> name = new ObservableField<>();
    public final ObservableInt age = new ObservableInt();
}
