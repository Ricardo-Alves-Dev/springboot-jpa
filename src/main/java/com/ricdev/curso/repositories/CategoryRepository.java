package com.ricdev.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricdev.curso.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
