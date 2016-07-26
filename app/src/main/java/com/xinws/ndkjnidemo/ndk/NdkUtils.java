package com.xinws.ndkjnidemo.ndk;

/**
 * 项目名称：NdkJniDemo
 * 类描述：
 * 创建人：Jiamin.Sun
 * 创建时间：6/30/2016 1:50 PM
 */
public class NdkUtils {
    static {
        System.loadLibrary("NdkJniDemo");//之前在build.gradle里面设置的so名字，必须一致
    }

    public static native String getStringFormC();
}
