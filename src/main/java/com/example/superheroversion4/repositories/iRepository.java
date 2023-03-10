package com.example.superheroversion4.repositories;

import com.example.superheroversion4.dto.CityHeroDTO;
import com.example.superheroversion4.dto.HeroPowerDTO;
import com.example.superheroversion4.dto.SuperheroDTO;
import com.example.superheroversion4.model.Superhero;

import java.util.List;

public interface iRepository {

    // En tilføjelse, hvor at man kan se hvilke superhelte der befinder sig i databasen, og hvilke attributter de har
    List<Superhero> getSuperhero();

    // Svar på første JSON spørgsmål, som indebærer superheroName, realName og creationYear
    List<SuperheroDTO> getOneSuperhero(String superheroName);

    // Svar på andet JSON spørgsmål, som formoder at udregne den samlede mængde af superkræfter som en superhelt har
    // Attributterne som den indeholder er superheroName, realName, superpower
    List<HeroPowerDTO> getAllPowers(String superheroName);

    // svar på trejde JSON spørgsmål som fortæller alle de superkræfter en superhelt har,
    // med attributterne superheroName, realName, superpower
    List<HeroPowerDTO> CertinHeroWithHeropower (String superheroName);

   // Svar på fjerede JSON spørgsmål, som retunerer hvilken by superhelten kommer fra med atributterne realName og cityName
    List<CityHeroDTO> HeroFromCityWithName(String superheroName);



}
