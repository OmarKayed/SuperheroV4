package com.example.superheroversion4.dto;

public class HeroCountPowerDTO {
    int countPower;
    private String superheroName;
    private String realName;
    private String superpower;

    public HeroCountPowerDTO(String superheroName, String realName, String superpower, int countPower) {
        this.superheroName = superheroName;
        this.realName = realName;
        this.superpower = superpower;
        this.countPower = countPower;
    }

    public void setCountPower(int countPower) {
        this.countPower = countPower;
    }
}
