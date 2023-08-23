package com.example.springbootstudy;

import com.example.springbootstudy.dto.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRepository extends JpaRepository<Coffee, String> {
}