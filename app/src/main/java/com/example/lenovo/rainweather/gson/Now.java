package com.example.lenovo.rainweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 2018/12/18.
 */

public class Now {
    @SerializedName("temp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }

}
