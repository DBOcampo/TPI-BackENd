package com.portfolio.portfolioBackend.service;


import com.portfolio.portfolioBackend.model.EduList;
import java.util.List;

public interface IEduListService {
    
    public List<EduList> getList();
    
    public void saveList (EduList list);
    
    public void deleteList (Long id);
    
    public EduList findList (Long id);
}
