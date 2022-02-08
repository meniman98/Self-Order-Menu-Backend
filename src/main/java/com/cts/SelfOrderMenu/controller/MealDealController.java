package com.cts.SelfOrderMenu.controller;


import com.cts.SelfOrderMenu.model.MealDeal;
import com.cts.SelfOrderMenu.repo.MealDealRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menu/mealdeal/")
public class MealDealController {

    @Autowired
    MealDealRepo repo;

    @GetMapping("get")
    public List<MealDeal> getAll() {
        return repo.findAll();
    }
}
