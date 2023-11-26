package com.youtube.firstProject.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.youtube.firstProject.model.User;


public interface RegistrationRep extends JpaRepository<User, Integer>
{
  
     
} 
