package com.portfolio.portfolioBackend.controller;

import com.portfolio.portfolioBackend.model.infoCard;
import com.portfolio.portfolioBackend.service.IinfoCardService;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
public class infoCardController {
    @Autowired
    private IinfoCardService infoCardInfo;
    
    @GetMapping("/infoCard/traer")
    public List<infoCard> getInfo() {
        return infoCardInfo.getInfo();
    }
    
    @PostMapping("/infoCard/crear")
    public infoCard createInfo(@RequestBody infoCard info){
        infoCardInfo.saveInfo(info);
        return info;
    }
    
    @PutMapping("/infoCard/editar/{id}")
    public infoCard editInfo(@PathVariable Long id, @RequestBody infoCard infoCard){
        infoCard foundList = infoCardInfo.findList(id);
        foundList.setUbicacion(infoCard.getUbicacion());
        foundList.setEdad(infoCard.getEdad());
        foundList.setSobremi(infoCard.getSobremi());
        infoCardInfo.saveInfo(foundList);
        return foundList;
    }
}

