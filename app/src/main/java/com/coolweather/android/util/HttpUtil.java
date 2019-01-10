package com.coolweather.android.util;
/*
 *OkHttp创建的的http工具类
 */

import okhttp3.OkHttpClient;
import okhttp3.Request;

//发起HTTP请求，传入请求地址，并注册一个回调来处理服务器响应。
public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
