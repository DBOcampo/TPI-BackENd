package com.portfolio.portfolioBackend.service;



import com.portfolio.portfolioBackend.model.skillDi;
import java.util.List;

public interface IskillDiService {
    
    public List<skillDi> getSkills();
    
    public void saveSkill (skillDi skill);
    
    public void deleteSkill (Long id);
    
    public skillDi findSkill (Long id);
}

