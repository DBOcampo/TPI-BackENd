package com.portfolio.portfolioBackend.repository;

import com.portfolio.portfolioBackend.model.ExpList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpListRepository extends JpaRepository <ExpList, Long> {
    
}
