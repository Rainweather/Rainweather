package com.example.lenovo.rainweather.gson;

/**
 * Created by lenovo on 2018/12/18.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
