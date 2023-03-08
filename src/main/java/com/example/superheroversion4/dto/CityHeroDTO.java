package com.example.superheroversion4.dto;

public class CityHeroDTO {

    private String realName;
    private String cityName;

    public CityHeroDTO (String realName, String cityName) {
        this.realName = realName;
        this.cityName = cityName;
    }

    public String getCityname() {
        return cityName;
    }

    public String getRealName() {
        return realName;
    }
}
