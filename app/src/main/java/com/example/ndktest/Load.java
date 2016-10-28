package com.example.ndktest;

/**
 * Created by BigRun on 2016/9/22.
 */
public class Load {

    static {
        //载入名为“lb”的c++库
        System.loadLibrary("ndktest");
    }

    //调用库里的方法“addInt()”
    public native int addInt(int a, int b);
}
