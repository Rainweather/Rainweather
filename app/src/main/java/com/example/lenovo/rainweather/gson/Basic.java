package com.example.lenovo.rainweather.gson;

/**
 * Created by lenovo on 2018/12/18.
 */

public class Basic {
        @SerializedName("city")
        public String cityName;
        @SerializedName("id")
        public String weatherId;
        public Update update;
        public class Update{
            @SerializedName("loc")
            public String updateTime;
        }

}
