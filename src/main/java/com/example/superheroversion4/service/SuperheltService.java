package com.example.superheroversion4.service;

import com.example.superheroversion4.dto.HeroPowerDTO;
import com.example.superheroversion4.model.Superhelt;
import com.example.superheroversion4.repositories.SuperheltRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperheltService {
    private SuperheltRepository superheltRepository;

    public SuperheltService(SuperheltRepository superheltRepository) {
        this.superheltRepository = superheltRepository;
    }

    public List<Superhelt> getSuperhero() {
        return superheltRepository.getSuperhero();
    }

    public List<HeroPowerDTO> getAllPowers(){
        return superheltRepository.getAllPowers();
    }

    public Superhelt getOneSuperhero(String superheroName){
        return superheltRepository.getOneSuperhero(superheroName);
    }
}
