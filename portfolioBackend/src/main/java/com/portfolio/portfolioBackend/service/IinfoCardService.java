package com.portfolio.portfolioBackend.service;


import com.portfolio.portfolioBackend.model.infoCard;
import java.util.List;

public interface IinfoCardService {
    
    public List<infoCard> getInfo();
    
    public void saveInfo (infoCard info);
    
    public infoCard findList (Long id);
    
}