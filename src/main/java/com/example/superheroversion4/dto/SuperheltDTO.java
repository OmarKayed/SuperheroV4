package com.example.superheroversion4.dto;

public class SuperheltDTO {
    private String superheroName;
    private String realName;
    private int creationYear;

    public SuperheltDTO(String superheroName, String realName, int creationYear) {
        this.superheroName = superheroName;
        this.realName = realName;
        this.creationYear = creationYear;
    }

    public String getSuperheroName() {
        return superheroName;
    }

    public String getRealName() {
        return realName;
    }

    public int getCreationYear() {
        return creationYear;
    }
}
