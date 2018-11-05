package com.swagger.controller;

import com.swagger.mapper.PetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SwaggerDeleteController {
    @Autowired
    private PetMapper petMapper;

    @RequestMapping(value = "/delete/{p_id}", method = RequestMethod.GET)
    public String deleteByPrimaryKey(@PathVariable("p_id") int p_id){
        System.out.println("asdasd");
        petMapper.deleteByPrimaryKey(p_id);
        System.out.println("66666");
        return "redirect:/index";
    }

}
