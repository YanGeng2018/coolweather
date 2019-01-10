//建立Basic基础类
package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    //使用@SerializedName注解建立与Java的映射关系
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
