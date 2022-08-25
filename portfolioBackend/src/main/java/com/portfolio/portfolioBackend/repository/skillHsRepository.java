package com.portfolio.portfolioBackend.repository;

import com.portfolio.portfolioBackend.model.skillHs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface skillHsRepository extends JpaRepository <skillHs, Long> {
    
}

