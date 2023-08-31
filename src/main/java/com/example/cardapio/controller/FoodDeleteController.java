package com.example.cardapio.controller;

import com.example.cardapio.food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("delete")
public class FoodDeleteController {

    @Autowired
    private FoodRepository repository;

    //DEU CERTO CARAIOOOOOOOO
    /*
        Aqui ele vai precisar de um ID no header, ai depois ele vai fazer o delete no banco.
    */
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/{id}")
    public void deleteFood(@PathVariable Long id){
        repository.deleteById(id);
    }

    //Remover todos os itens da tabela
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/all")
    public void deleteAllFoods(){
        repository.deleteAll();
    }

}
