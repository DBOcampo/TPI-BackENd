package com.portfolio.portfolioBackend.controller;

import com.portfolio.portfolioBackend.model.ExpList;
import com.portfolio.portfolioBackend.service.IExpListService;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
public class ExpListController {
    @Autowired
    private IExpListService interExpList;
    
    @GetMapping("/ExpList/traer")
    public List<ExpList> getPersonas() {
        return interExpList.getList();
    }
    
    @PostMapping("/ExpList/crear")
    public ExpList createList(@RequestBody ExpList list){
        interExpList.saveList(list);
        return list;
    }
    
    @DeleteMapping("/ExpList/borrar/{id}")
    public String deleteList(@PathVariable Long id){
        interExpList.deleteList(id);
        return null;
    }
    
    @PutMapping("/ExpList/editar/{id}")
    public ExpList editList(@PathVariable Long id, @RequestBody ExpList list){
        ExpList foundList = interExpList.findList(id);
        foundList.setEmpresa(list.getEmpresa());
        foundList.setPuesto(list.getPuesto());
        foundList.setPeriodo(list.getPeriodo());
        interExpList.saveList(foundList);
        return foundList;
    }
}
