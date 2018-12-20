package com.example.lenovo.rainweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 2018/12/18.
 */

public class Forecast {
    public String data;
    @SerializedName("tmp")
    public  Temperature temperture;
    @SerializedName("cond")
    public More more;
    public class Temperature{
        public  String max;
        public String min;
    }
    public  class More{
        @SerializedName("txt_d")
        public String info;
    }
}
