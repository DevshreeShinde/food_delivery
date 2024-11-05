package com.example.food_delivery.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.food_delivery.Entity.Users;

public interface UsersRepository extends JpaRepository<Users,Long> {
    
}
