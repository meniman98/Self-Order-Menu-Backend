package com.cts.SelfOrderMenu.repo;

import com.cts.SelfOrderMenu.model.Drink;
import org.springframework.data.repository.CrudRepository;

public interface DrinkRepo extends CrudRepository<Drink, Long> {
}
