package com.ricdev.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ricdev.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
