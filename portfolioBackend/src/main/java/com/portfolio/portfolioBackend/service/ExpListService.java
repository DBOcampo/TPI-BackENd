package com.portfolio.portfolioBackend.service;

import com.portfolio.portfolioBackend.model.ExpList;
import com.portfolio.portfolioBackend.repository.ExpListRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpListService implements IExpListService {
    @Autowired
    private ExpListRepository expRepository;   

    @Override
    public List<ExpList> getList() {
        List<ExpList> expList = expRepository.findAll();
        return expList;
    }

    @Override
    public void saveList(ExpList list) {
        expRepository.save(list);
    }

    @Override
    public void deleteList(Long id) {
        expRepository.deleteById(id);
    }

    @Override
    public ExpList findList(Long id) {
        ExpList expList = expRepository.findById(id).orElse(null);
        return expList;
    }
}
