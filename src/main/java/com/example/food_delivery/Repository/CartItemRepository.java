package com.example.food_delivery.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.food_delivery.Entity.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem,Long> {
    
}
