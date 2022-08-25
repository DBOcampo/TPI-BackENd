package com.portfolio.portfolioBackend.service;

import com.portfolio.portfolioBackend.model.ExpList;
import java.util.List;

public interface IExpListService {
    
    public List<ExpList> getList();
    
    public void saveList (ExpList list);
    
    public void deleteList (Long id);
    
    public ExpList findList (Long id);
    
}