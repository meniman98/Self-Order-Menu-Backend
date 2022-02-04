package com.cts.SelfOrderMenu.controller;


import com.cts.SelfOrderMenu.model.Food;
import com.cts.SelfOrderMenu.repo.FoodRepo;
import com.cts.SelfOrderMenu.repo.MealDealRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/menu/food/")
public class FoodController {

    @Autowired
    FoodRepo foodRepo;

    @Autowired
    MealDealRepo mealDealRepo;

    @GetMapping("get")
    public List<Food> getAllProducts() {
        return foodRepo.findAll();
    }

    @GetMapping("get/{id}")
    public @ResponseBody
    Optional<Food> getSingleProduct(@PathVariable Long id) {
        return foodRepo.findById(id);
    }

    /*Post method works great, leaving fields empty will cause them to be
     * auto-filled to the default values (null/0.00)
     * You can also pass in an empty JSON object like {} and it'll still work,
     * all that'll happen is everything turns null and 0.00. The ID will be generated automatically*/
    @PostMapping("post")
    Food addFood(@RequestBody Food food) {
        return foodRepo.save(food);
    }


    /*Put works great. Using an existing ID will alter that object fine
     * Using an ID that doesn't exist will create a new object,
     * with its ID incremented correctly. MySQL takes care of it*/
    @PutMapping("put/{id}")
    Food editFood(@RequestBody Food newFood, @PathVariable Long id) {
        return foodRepo.findById(id)
                .map(oldFood -> {
                    oldFood.setFoodName(newFood.getFoodName());
                    oldFood.setFoodDesc(newFood.getFoodDesc());
                    oldFood.setPrice(newFood.getPrice());
                    oldFood.setImageUrl(newFood.getImageUrl());
                    return foodRepo.save(oldFood);
                })
                .orElseGet(() -> foodRepo.save(newFood));
    }


    /*Delete works great*/
    @DeleteMapping("delete/{id}")
    String deleteFood(@PathVariable Long id) {
        if (foodRepo.existsById(id)) {
            foodRepo.deleteById(id);
            return String.format("Object with ID of %d successfully deleted", id);
        }
        else {
            return String.format("No object was found with ID of %d to delete", id);
        }
    }
}