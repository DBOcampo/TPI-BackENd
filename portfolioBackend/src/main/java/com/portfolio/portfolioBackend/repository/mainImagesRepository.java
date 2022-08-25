package com.portfolio.portfolioBackend.repository;

import com.portfolio.portfolioBackend.model.mainImages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface mainImagesRepository extends JpaRepository <mainImages, Long> {
    
}
