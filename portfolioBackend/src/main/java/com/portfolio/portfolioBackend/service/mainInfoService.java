package com.portfolio.portfolioBackend.service;

import com.portfolio.portfolioBackend.model.mainInfo;
import com.portfolio.portfolioBackend.repository.mainInfoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class mainInfoService implements ImainInfoService {
    @Autowired
    private mainInfoRepository mainInfoRepository;   

    @Override
    public List<mainInfo> getInfo() {
        List<mainInfo> mInfo = mainInfoRepository.findAll();
        return mInfo;
    }

    @Override
    public void saveInfo(mainInfo info) {
        mainInfoRepository.save(info);
    }

    @Override
    public mainInfo findInfo(Long id) {
        mainInfo mInfo = mainInfoRepository.findById(id).orElse(null);
        return mInfo;
    }
}
