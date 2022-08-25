package com.portfolio.portfolioBackend.repository;

import com.portfolio.portfolioBackend.model.Proyects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectsRepository extends JpaRepository <Proyects, Long> {
    
}
