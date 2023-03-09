package com.example.superheroversion4.repositories;

import com.example.superheroversion4.dto.CityHeroDTO;
import com.example.superheroversion4.dto.HeroPowerDTO;
import com.example.superheroversion4.dto.SuperheltDTO;
import com.example.superheroversion4.model.Superhelt;

import java.util.ArrayList;
import java.util.List;

public class ArrayRespository implements iRepository{

    @Override
    public List<Superhelt> getSuperhero() {
        List<Superhelt> superhelt = new ArrayList<>();
        for (Superhelt superhero : superhelt) {
            superhelt.add(new Superhelt(superhero.getSuperheroID(), superhero.getSuperheroName(), superhero.getRealName(),
                    superhero.getCreationYear(), superhero.getCityName(), superhero.getSuperpower(), superhero.isHuman()));
        }
        return superhelt;
    }

    @Override
    public List<SuperheltDTO> getOneSuperhero(String superheroName) {
        List<SuperheltDTO> superheltDTOArrayList = new ArrayList<>();

        for (SuperheltDTO superhero : superheltDTOArrayList) {
            String name = superhero.getSuperheroName().toLowerCase();
            if (name.contains(superheroName.toLowerCase().trim())) {
                superheltDTOArrayList.add(new SuperheltDTO(superhero.getSuperheroName(), superhero.getRealName(), superhero.getCreationYear()));
            }
        }
        return superheltDTOArrayList;
    }

    @Override
    public List<HeroPowerDTO> getAllPowers(String superheroName) {
        List<HeroPowerDTO> heroPowerDTOList = new ArrayList<>();
        for (HeroPowerDTO superpower : heroPowerDTOList) {
            if (superpower.getSuperheroName().equals(superheroName)) {
                heroPowerDTOList.add(superpower);
            }
        }
        return heroPowerDTOList;
    }

    @Override
    public List<HeroPowerDTO> CertinHeroWithHeropower(String superheroName) {
        List<HeroPowerDTO> heroPowerDTOList = new ArrayList<>();
        for (HeroPowerDTO superpower : heroPowerDTOList) {
            if (superpower.getSuperheroName().equals(superheroName)) {
                heroPowerDTOList.add(superpower);
            }
        }
        return heroPowerDTOList;

    }

    @Override
    public List<CityHeroDTO> HeroFromCityWithName(String superheroName) {
        List<CityHeroDTO> cityHeroDTOList = new ArrayList<>();

        // find heroes with specified name
        for (CityHeroDTO cityHeroDTO : cityHeroDTOList) {
            if (cityHeroDTO.getRealName().equals(superheroName)) {
                cityHeroDTOList.add(new CityHeroDTO(cityHeroDTO.getRealName(), cityHeroDTO.getCityname()));
            }
        }

        return cityHeroDTOList;

    }


}
