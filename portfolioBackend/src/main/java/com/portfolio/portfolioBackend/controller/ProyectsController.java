package com.portfolio.portfolioBackend.controller;

import com.portfolio.portfolioBackend.model.Proyects;
import com.portfolio.portfolioBackend.service.IProyectsService;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
public class ProyectsController {
    @Autowired
    private IProyectsService interPr;
    
    @GetMapping("/Proyects/traer")
    public List<Proyects> getProyects() {
        return interPr.getProyects();
    }
    
    @PostMapping("/Proyects/crear")
    public Proyects createProyect(@RequestBody Proyects proyect){
        interPr.saveProyect(proyect);
        return proyect;
    }
    
    @DeleteMapping("/Proyects/borrar/{id}")
    public String deleteProyect(@PathVariable Long id){
        interPr.deleteProyect(id);
        return null;
    }
    
    @PutMapping("/Proyects/editar/{id}")
    public Proyects editProyect (@PathVariable Long id, @RequestBody Proyects proyect){
        Proyects foundList = interPr.findProyect(id);
        foundList.setImgurl(proyect.getImgurl());
        foundList.setNombre(proyect.getNombre());
        foundList.setDescripcion(proyect.getDescripcion());
        foundList.setLink(proyect.getLink());
        interPr.saveProyect(foundList);
        return foundList;
    }
}

