package com.portfolio.portfolioBackend.service;


import com.portfolio.portfolioBackend.model.EduList;
import com.portfolio.portfolioBackend.repository.EduListRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EduListService implements IEduListService {
    @Autowired
    private EduListRepository eduRepository;   

    @Override
    public List<EduList> getList() {
        List<EduList> eduList = eduRepository.findAll();
        return eduList;
    }

    @Override
    public void saveList(EduList list) {
        eduRepository.save(list);
    }

    @Override
    public void deleteList(Long id) {
        eduRepository.deleteById(id);
    }

    @Override
    public EduList findList(Long id) {
        EduList eduList = eduRepository.findById(id).orElse(null);
        return eduList;
    }
}
