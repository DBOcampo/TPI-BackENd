package com.portfolio.portfolioBackend.controller;


import com.portfolio.portfolioBackend.model.mainInfo;
import com.portfolio.portfolioBackend.service.ImainInfoService;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
public class mainInfoController {
    @Autowired
    private ImainInfoService interMainInfo;
    
    @GetMapping("/mainInfo/traer")
    public List<mainInfo> getInfo() {
        return interMainInfo.getInfo();
    }
    
    @PostMapping("/mainInfo/crear")
    public mainInfo createInfo(@RequestBody mainInfo info){
        interMainInfo.saveInfo(info);
        return info;
    }
    
    @PutMapping("/mainInfo/editar/{id}")
    public mainInfo editImage(@PathVariable Long id, @RequestBody mainInfo mainInfo){
        mainInfo foundList = interMainInfo.findInfo(id);
        foundList.setNombre(mainInfo.getNombre());
        foundList.setOcupacion(mainInfo.getOcupacion());
        interMainInfo.saveInfo(foundList);
        return foundList;
    }
}

