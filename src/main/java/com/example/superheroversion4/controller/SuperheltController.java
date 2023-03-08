package com.example.superheroversion4.controller;

import com.example.superheroversion4.dto.HeroCountPowerDTO;
import com.example.superheroversion4.dto.HeroPowerDTO;
import com.example.superheroversion4.dto.SuperheltDTO;
import com.example.superheroversion4.model.Superhelt;
import com.example.superheroversion4.service.SuperheltService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("superhelte")
public class SuperheltController {

    private SuperheltService superheltService;

    public SuperheltController(SuperheltService superheltService) {
        this.superheltService = superheltService;
    }

    @GetMapping(path = {"", "/"})
    public ResponseEntity<List<Superhelt>> getSuperheroes() {
        List<Superhelt> superheroList = superheltService.getSuperhero();
        return new ResponseEntity<List<Superhelt>>(superheroList, HttpStatus.OK);
    }

    @GetMapping(path = {"superhelt/{superheroName}"})
    public ResponseEntity<SuperheltDTO> getOneSuperhero(@PathVariable String superheroName) {
        SuperheltDTO superhero = superheltService.getOneSuperhero(superheroName);
        return new ResponseEntity<>(superhero, HttpStatus.OK);
    }


    @GetMapping(path = {"/superpower/count/{superheroName}"})
    public ResponseEntity<List<HeroPowerDTO>> getAllPower(@PathVariable String superheroName) {
        List<HeroPowerDTO> superheroList = superheltService.getAllPowers(superheroName);
        return new ResponseEntity<List<HeroPowerDTO>>(superheroList, HttpStatus.OK);

    }

}
