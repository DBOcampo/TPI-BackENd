package com.portfolio.portfolioBackend.repository;

import com.portfolio.portfolioBackend.model.infoCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface infoCardRepository extends JpaRepository <infoCard, Long> {
    
}
