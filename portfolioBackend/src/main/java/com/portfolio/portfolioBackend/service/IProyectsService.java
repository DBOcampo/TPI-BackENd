package com.portfolio.portfolioBackend.service;

import com.portfolio.portfolioBackend.model.Proyects;
import java.util.List;

public interface IProyectsService {
    
    public List<Proyects> getProyects();
    
    public void saveProyect (Proyects list);
    
    public void deleteProyect (Long id);
    
    public Proyects findProyect (Long id);
    
}