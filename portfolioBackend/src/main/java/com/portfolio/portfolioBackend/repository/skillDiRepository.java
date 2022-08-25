package com.portfolio.portfolioBackend.repository;


import com.portfolio.portfolioBackend.model.skillDi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface skillDiRepository extends JpaRepository <skillDi, Long> {
    
}


