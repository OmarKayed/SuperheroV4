package com.example.superheroversion4.dto;

import java.util.Collections;
import java.util.List;

public class HeroPowerDTO {
    private String superheroName;
    private String realName;
    List<String> superpower;


    public HeroPowerDTO(String superheroName, String realName, List<String> superpower) {
        this.superheroName = superheroName;
        this.realName = realName;
        this.superpower = superpower;

    }

    public String getSuperheroName() {
        return superheroName;
    }

    public String getRealName() {
        return realName;
    }

    public List<String> getSuperpower() {
        return superpower;
    }

    public void setSuperheroName(String superheroName) {
        this.superheroName = superheroName;
    }

    public void setSuperpower(List<String> superpower) {
        this.superpower = superpower;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
