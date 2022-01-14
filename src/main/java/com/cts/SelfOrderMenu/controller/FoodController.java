package com.cts.SelfOrderMenu.controller;


import com.cts.SelfOrderMenu.model.Food;
import com.cts.SelfOrderMenu.repo.FoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
@RequestMapping("/menu/food/")
public class FoodController {

    @Autowired
    FoodRepo repo;

    @GetMapping(path = "get")
    public @ResponseBody Iterable<Food> getAllProducts() {
        return repo.findAll();
    }

    @GetMapping(path = "get{id}")
    public @ResponseBody
    Optional<Food> getSingleProduct(@PathVariable Long id) {
       return repo.findById(id);
    }
}
