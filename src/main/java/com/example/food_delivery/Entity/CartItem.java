package com.example.food_delivery.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CartItem {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   public int id;
    
}
