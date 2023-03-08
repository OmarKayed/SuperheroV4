package com.example.superheroversion4.dto;

import java.util.Collections;
import java.util.List;

public class HeroPowerDTO {
    private String superheroName;
    private String realName;
    private String superpower;


    public HeroPowerDTO(String superheroName, String realName, String superpower) {
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

    public String getSuperpower() {
        return superpower;
    }

}
