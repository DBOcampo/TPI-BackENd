package com.portfolio.portfolioBackend.controller;


import com.portfolio.portfolioBackend.model.EduList;
import com.portfolio.portfolioBackend.service.IEduListService;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
public class EduListController {
    @Autowired
    private IEduListService interEduList;
    
    @GetMapping("/EduList/traer")
    public List<EduList> getPersonas() {
        return interEduList.getList();
    }
    
    @PostMapping("/EduList/crear")
    public EduList createList(@RequestBody EduList list){
        interEduList.saveList(list);
        return list;
    }
    
    @DeleteMapping("/EduList/borrar/{id}")
    public String deleteList(@PathVariable Long id){
        interEduList.deleteList(id);
        return null;
    }
    
    @PutMapping("/EduList/editar/{id}")
    public EduList editList(@PathVariable Long id, @RequestBody EduList list){
        EduList foundList = interEduList.findList(id);
        foundList.setInstitucion(list.getInstitucion());
        foundList.setTitulo(list.getTitulo());
        foundList.setPeriodo(list.getPeriodo());
        interEduList.saveList(foundList);
        return foundList;
    }
}
