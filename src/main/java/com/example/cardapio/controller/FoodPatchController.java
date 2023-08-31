package com.example.cardapio.controller;

import com.example.cardapio.food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("edit")
public class FoodPatchController {

    @Autowired
    private FoodRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PatchMapping("/{id}")
    public void deleteFood(@PathVariable Long id){
        repository.deleteById(id);
    }

}
