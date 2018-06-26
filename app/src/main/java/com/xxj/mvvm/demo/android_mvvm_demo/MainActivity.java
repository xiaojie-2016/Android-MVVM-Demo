package com.xxj.mvvm.demo.android_mvvm_demo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xxj.mvvm.demo.android_mvvm_demo.bean.User2;
import com.xxj.mvvm.demo.android_mvvm_demo.databinding.ActivityMain2Binding;
import com.xxj.mvvm.demo.android_mvvm_demo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        sample1();

//        sample2();

        sample3();
    }

    /**
     * Android MVVM 系列之 Databinding（一）
     */
    private void sample1() {
        //        setContentView(R.layout.activity_main);
        /*
         使用 DataBinding 布局后这里需要 DataBindingUtil 来完成 setContentView
         返回值是布局的 ViewBinding 对象，
         这个类是 DataBinding 框架自动生成，类文件在 app/build/intermediates/classes/yourpackage/databinding
         修改布局后如果发现 ViewBinding 类没有及时生成，工具栏找小锤子锤（Make Project）一下就好
        */
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        /*
         如果你觉得自动生成的类名不爽的话，可以在 data 标签内加上 class 属性，如：
         <data class=".MyBinding">
         这样的话DataBinding生成的类名就是你想要的了
        */
//        MyBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        User user = new User();
        user.setName("张三");
        user.setAge(88);
        user.setSex("男");
        //这里可能会有好事之徒说，我不传 user 呢？我不给他某个参数赋值呢？
        //答：DataBinding不惧怕空指针异常,若表达式结果为null,则根据其结果的值类型显示不同,比如引用类型显示null,int类型显示0,string类型显示空
        binding.setUser(user);
        binding.setEvent(new EventHandler());
    }

    /**
     * Android MVVM 系列之 Databinding（二）
     */
    private void sample2() {
        //这里为了行事方便，给大家新写了一套布局
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main2);

        User2 user2 = new User2();
        user2.age.set(1000);
        user2.name.set("haruipote");
        binding.setUser(user2);
        binding.setEvent(new EventHandler());
    }

    /**
     * Android MVVM 系列之 Databinding（三）
     * 注解的使用
     */
    private void sample3() {
        sample2();
        binding.setImageUrl("https://github.com/xiaojie-2016/Android-MVVM-Demo/blob/master/img/img1.jpg?raw=true");
    }
}
