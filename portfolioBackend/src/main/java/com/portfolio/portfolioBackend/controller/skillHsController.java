package com.portfolio.portfolioBackend.controller;

import com.portfolio.portfolioBackend.model.skillHs;
import com.portfolio.portfolioBackend.service.IskillHsService;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
public class skillHsController {
    @Autowired
    private IskillHsService interSkill;
    
    @GetMapping("/skillHs/traer")
    public List<skillHs> getPersonas() {
        return interSkill.getSkills();
    }
    
    @PostMapping("/skillHs/crear")
    public skillHs createSkill(@RequestBody skillHs skill){
        interSkill.saveSkill(skill);
        return skill;
    }
    
    @DeleteMapping("/skillHs/borrar/{id}")
    public String deleteSkill(@PathVariable Long id){
        interSkill.deleteSkill(id);
        return null;
    }
    
    @PutMapping("/skillHs/editar/{id}")
    public skillHs editSkill(@PathVariable Long id, @RequestBody skillHs skill){
        skillHs foundList = interSkill.findSkill(id);
        foundList.setSkill(skill.getSkill());
        foundList.setPorcentaje(skill.getPorcentaje());
        foundList.setColor(skill.getColor());
        interSkill.saveSkill(foundList);
        return foundList;
    }
    
}
    