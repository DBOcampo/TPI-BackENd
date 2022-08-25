package com.portfolio.portfolioBackend.service;

import com.portfolio.portfolioBackend.model.ExpList;
import com.portfolio.portfolioBackend.model.mainImages;
import com.portfolio.portfolioBackend.repository.ExpListRepository;
import com.portfolio.portfolioBackend.repository.mainImagesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class mainImagesService implements ImainImagesService {
    @Autowired
    private mainImagesRepository mainIRepository;   

    @Override
    public List<mainImages> getImages() {
        List<mainImages> mainImages = mainIRepository.findAll();
        return mainImages;
    }

    @Override
    public void saveImages(mainImages img) {
        mainIRepository.save(img);
    }
    
    @Override
    public mainImages findList(Long id) {
        mainImages mainIMG = mainIRepository.findById(id).orElse(null);
        return mainIMG;
    }
}
