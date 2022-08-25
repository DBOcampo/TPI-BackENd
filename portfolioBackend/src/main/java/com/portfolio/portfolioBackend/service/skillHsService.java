package com.portfolio.portfolioBackend.service;


import com.portfolio.portfolioBackend.model.skillHs;
import com.portfolio.portfolioBackend.repository.skillHsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class skillHsService implements IskillHsService {
    @Autowired
    private skillHsRepository skillRepository;

    @Override
    public List<skillHs> getSkills() {
        List<skillHs> skills = skillRepository.findAll();
        return skills;
    }

    @Override
    public void saveSkill(skillHs skill) {
        skillRepository.save(skill);
    }

    @Override
    public void deleteSkill(Long id) {
        skillRepository.deleteById(id);
    }

    @Override
    public skillHs findSkill(Long id) {
        skillHs skill = skillRepository.findById(id).orElse(null);
        return skill;
    }
}