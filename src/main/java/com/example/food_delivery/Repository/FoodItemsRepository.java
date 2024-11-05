package com.example.food_delivery.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.food_delivery.Entity.FoodItems;

public interface FoodItemsRepository extends JpaRepository<FoodItems,Long> {
    
}
