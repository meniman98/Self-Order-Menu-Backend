package com.cts.SelfOrderMenu.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "meal_deal")
public class MealDeal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany
    Set<Food> foodSet;

    @OneToMany
    Set<Drink> drinkSet;

    private double price;
}
