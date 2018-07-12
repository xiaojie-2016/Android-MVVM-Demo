package com.xxj.mvvm.demo.android_mvvm_demo;

import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.IdRes;
import android.widget.ImageView;

import com.xxj.mvvm.demo.android_mvvm_demo.utils.GlideApp;

/**
 * Created by xxj on 06/24.
 */

public class MyBindingAdapters {
    /**
     * BindingAdapter("imageUrl") 里面的 "imageUrl" 就是自定义生成的方法，在 xml 文件种使用时命名控件随意
     * BindingAdapter("bind:imageUrl") 这种是指定命名空间的写法，xml 中的属性必须写成 bind:imageUrl="@{...}" 这种形式
     * 如果定义的方法重复了，使用最后一个，系统找 BindingAdapter 注解的方法时有它自己的先后顺序，先找系统的再找自己定义的，这样的话自己定义的方法就能覆盖系统提供的方法了
     */
    @BindingAdapter("imageUrl")
    public static void bindImageUrl(ImageView imageView, String url) {
        GlideApp.with(imageView.getContext())
                .load(url)
                .into(imageView);
    }

    /**
     * BindingAdapter 还可以定义一组方法，您可以选择他们是否必须同时定义
     */
    @BindingAdapter(value = {"imageUrl", "holder", "error"}, requireAll = true)
    public static void bingImgs(ImageView imageView, String url, Drawable holder, Drawable error) {
        //Glide 要求的这些值都是非空的，我这里就 requireAll = true 了，你也可以在这里判空给自定义的默认值，设置 requireAll = false
        GlideApp.with(imageView.getContext())
                .load(url)
                .placeholder(holder)
                .error(error)
                .into(imageView);
    }
}
