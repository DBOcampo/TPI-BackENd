package com.portfolio.portfolioBackend.service;

import com.portfolio.portfolioBackend.model.infoCard;
import com.portfolio.portfolioBackend.repository.infoCardRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class infoCardService implements IinfoCardService {
    @Autowired
    private infoCardRepository infCaRepository;   

    @Override
    public List<infoCard> getInfo() {
        List<infoCard> iCard = infCaRepository.findAll();
        return iCard;
    }

    @Override
    public void saveInfo(infoCard info) {
        infCaRepository.save(info);
    }

    @Override
    public infoCard findList(Long id) {
        infoCard mInfo = infCaRepository.findById(id).orElse(null);
        return mInfo;
    }
}
