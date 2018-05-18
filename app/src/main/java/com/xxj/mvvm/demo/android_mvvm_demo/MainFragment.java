package com.xxj.mvvm.demo.android_mvvm_demo;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xxj.mvvm.demo.android_mvvm_demo.databinding.FragmentMainBinding;

/**
 * Created by xxj on 04/05.
 */

public class MainFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //DataBinding 布局是可以使用下面两种方式，inflate 出来的。
//        FragmentMainBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);
        FragmentMainBinding binding = FragmentMainBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}
