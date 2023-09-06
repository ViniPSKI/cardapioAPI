package com.example.cardapio.controller;

import com.example.cardapio.food.FoodRepository;
import com.example.cardapio.food.FoodRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.cardapio.food.Food;

@RestController
@RequestMapping("edit")
public class FoodPatchController {

    @Autowired
    private FoodRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping("/{id}")
    public Food AlterFood(@PathVariable Long id, @RequestBody FoodRequestDTO foodRequestDTO){
        Food foodToUpdate = repository.findById(id).get();

        foodToUpdate.setTitle(foodRequestDTO.title());
        foodToUpdate.setImage(foodRequestDTO.image());
        foodToUpdate.setPrice(foodRequestDTO.price());

        repository.save(foodToUpdate);

        return repository.save(foodToUpdate);
    }

}
