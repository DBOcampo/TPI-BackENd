package com.portfolio.portfolioBackend.controller;

import com.portfolio.portfolioBackend.model.mainImages;
import com.portfolio.portfolioBackend.service.ImainImagesService;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
public class mainImagesController {
    @Autowired
    private ImainImagesService interMainImages;
    
    @GetMapping("/mainImages/traer")
    public List<mainImages> getPersonas() {
        return interMainImages.getImages();
    }
    
    @PostMapping("/mainImages/crear")
    public mainImages createIamge(@RequestBody mainImages image){
        interMainImages.saveImages(image);
        return image;
    }
    
    @PutMapping("/mainImages/editar/{id}")
    public mainImages editImage(@PathVariable Long id, @RequestBody mainImages mainImgs){
        mainImages foundList = interMainImages.findList(id);
        foundList.setImg(mainImgs.getImg());
        interMainImages.saveImages(foundList);
        return foundList;
    }
}
