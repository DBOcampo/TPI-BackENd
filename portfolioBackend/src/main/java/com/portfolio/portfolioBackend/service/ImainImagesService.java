package com.portfolio.portfolioBackend.service;

import com.portfolio.portfolioBackend.model.mainImages;
import java.util.List;

public interface ImainImagesService {
    
    public List<mainImages> getImages();
    
    public void saveImages (mainImages img);
    
    public mainImages findList (Long id);
    
}