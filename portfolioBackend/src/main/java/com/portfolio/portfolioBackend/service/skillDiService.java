package com.portfolio.portfolioBackend.service;


import com.portfolio.portfolioBackend.model.skillDi;
import com.portfolio.portfolioBackend.repository.skillDiRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class skillDiService implements IskillDiService {
    @Autowired
    private skillDiRepository skillRepository;

    @Override
    public List<skillDi> getSkills() {
        List<skillDi> skills = skillRepository.findAll();
        return skills;
    }

    @Override
    public void saveSkill(skillDi skill) {
        skillRepository.save(skill);
    }

    @Override
    public void deleteSkill(Long id) {
        skillRepository.deleteById(id);
    }

    @Override
    public skillDi findSkill(Long id) {
        skillDi skill = skillRepository.findById(id).orElse(null);
        return skill;
    }
}