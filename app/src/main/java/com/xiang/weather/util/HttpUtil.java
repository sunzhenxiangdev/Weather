package com.xiang.weather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by jose on 2016/12/26-10:36.
 * EMAIL:sunzhenxiangvip@126.com
 * http封装类
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
