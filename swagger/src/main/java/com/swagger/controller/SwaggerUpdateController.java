package com.swagger.controller;

import com.swagger.mapper.PetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SwaggerUpdateController {
    @Autowired
    private PetMapper petMapper;

    @RequestMapping(value = "/update/{p_id}", method = RequestMethod.GET)
    public String updatePetToShop(@PathVariable("p_id") int p_id){
        petMapper.updatePetToShop(p_id);
        return "redirect:/index";
    }
}
