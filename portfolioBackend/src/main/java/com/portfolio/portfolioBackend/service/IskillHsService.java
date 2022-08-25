package com.portfolio.portfolioBackend.service;


import com.portfolio.portfolioBackend.model.skillHs;
import java.util.List;

public interface IskillHsService {
    
    public List<skillHs> getSkills();
    
    public void saveSkill (skillHs list);
    
    public void deleteSkill (Long id);
    
    public skillHs findSkill (Long id);
}

