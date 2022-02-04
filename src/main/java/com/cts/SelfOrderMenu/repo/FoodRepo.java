package com.cts.SelfOrderMenu.repo;

import com.cts.SelfOrderMenu.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FoodRepo extends JpaRepository<Food, Long> {
}
