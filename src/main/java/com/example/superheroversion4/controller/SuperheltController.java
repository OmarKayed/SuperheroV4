package com.example.superheroversion4.controller;

import com.example.superheroversion4.model.Superhelt;
import com.example.superheroversion4.service.SuperheltService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("superhelte")
public class SuperheltController {

    private SuperheltService superheltService;

    public SuperheltController(SuperheltService superheltService) {
        this.superheltService = superheltService;
    }

    @GetMapping(path = "superhelt")
    public ResponseEntity<List<Superhelt>> getSuperheroes() {
        List<Superhelt> superheroList = superheltService.getSuperhelte();

        return new ResponseEntity<List<Superhelt>>(superheroList, HttpStatus.OK);

    }


}
