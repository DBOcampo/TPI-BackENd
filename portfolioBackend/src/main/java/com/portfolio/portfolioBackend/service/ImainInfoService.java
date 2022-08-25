package com.portfolio.portfolioBackend.service;


import com.portfolio.portfolioBackend.model.mainInfo;
import java.util.List;

public interface ImainInfoService {
    
    public List<mainInfo> getInfo();
    
    public void saveInfo (mainInfo info);
    
    public mainInfo findInfo (Long id);
    
}