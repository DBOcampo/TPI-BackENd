package com.portfolio.portfolioBackend.controller;

import com.portfolio.portfolioBackend.model.skillDi;
import com.portfolio.portfolioBackend.service.IskillDiService;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
public class skillDiController {
    @Autowired
    private IskillDiService interSkill;
    
    @GetMapping("/skillDi/traer")
    public List<skillDi> getPersonas() {
        return interSkill.getSkills();
    }
    
    @PostMapping("/skillDi/crear")
    public skillDi createSkill(@RequestBody skillDi skill){
        interSkill.saveSkill(skill);
        return skill;
    }
    
    @DeleteMapping("/skillDi/borrar/{id}")
    public String deleteSkill(@PathVariable Long id){
        interSkill.deleteSkill(id);
        return null;
    }
    
    @PutMapping("/skillDi/editar/{id}")
    public skillDi editSkill(@PathVariable Long id, @RequestBody skillDi idioma){
        skillDi foundList = interSkill.findSkill(id);
        foundList.setIdioma(idioma.getIdioma());
        foundList.setPorcentaje(idioma.getPorcentaje());
        foundList.setColor(idioma.getColor());
        interSkill.saveSkill(foundList);
        return foundList;
    }
    
}
    
