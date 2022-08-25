package com.portfolio.portfolioBackend.service;

import com.portfolio.portfolioBackend.model.Proyects;
import com.portfolio.portfolioBackend.repository.ProyectsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectsService implements IProyectsService {
    @Autowired
    private ProyectsRepository PrRepository;   

    @Override
    public List<Proyects> getProyects() {
        List<Proyects> proyects = PrRepository.findAll();
        return proyects;
    }

    @Override
    public void saveProyect(Proyects prs) {
        PrRepository.save(prs);
    }

    @Override
    public void deleteProyect(Long id) {
        PrRepository.deleteById(id);
    }

    @Override
    public Proyects findProyect(Long id) {
        Proyects proyects = PrRepository.findById(id).orElse(null);
        return proyects;
    }
}