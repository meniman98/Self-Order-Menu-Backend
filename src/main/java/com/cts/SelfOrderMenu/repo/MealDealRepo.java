package com.cts.SelfOrderMenu.repo;

import com.cts.SelfOrderMenu.model.MealDeal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealDealRepo extends JpaRepository<MealDeal, Long> {
}
