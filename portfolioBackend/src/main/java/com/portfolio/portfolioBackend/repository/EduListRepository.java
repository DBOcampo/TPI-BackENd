package com.portfolio.portfolioBackend.repository;


import com.portfolio.portfolioBackend.model.EduList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EduListRepository extends JpaRepository <EduList, Long> {
    
}
