package com.portfolio.portfolioBackend.repository;

import com.portfolio.portfolioBackend.model.mainInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface mainInfoRepository extends JpaRepository <mainInfo, Long> {
    
}

