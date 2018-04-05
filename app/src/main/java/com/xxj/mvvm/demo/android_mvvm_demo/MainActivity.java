package com.xxj.mvvm.demo.android_mvvm_demo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xxj.mvvm.demo.android_mvvm_demo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        /*
         使用 DataBinding 布局后这里需要 DataBindingUtil 来完成 setContentView
         返回值是布局的 ViewBinding 对象，
         这个类是 DataBinding 框架自动生成，类文件在 app/build/intermediates/classes/yourpackage/databinding
         修改布局后如果发现 ViewBinding 类没有及时生成，工具栏找小锤子锤（Make Project）一下就好
        */
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }
}
