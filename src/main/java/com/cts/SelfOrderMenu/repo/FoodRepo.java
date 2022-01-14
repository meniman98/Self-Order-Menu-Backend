package com.cts.SelfOrderMenu.repo;

import com.cts.SelfOrderMenu.model.Food;
import org.springframework.data.repository.CrudRepository;

public interface FoodRepo extends CrudRepository<Food, Long> {
}
