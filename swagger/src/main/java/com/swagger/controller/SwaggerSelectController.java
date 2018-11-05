package com.swagger.controller;

import com.swagger.entity.Pet;
import com.swagger.entity.User;
import com.swagger.mapper.PetMapper;
import com.swagger.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class SwaggerSelectController {

    @Autowired
    private PetMapper petMapper;

    @Autowired
    private UserMapper userMapper;


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        List<Pet> Pets = petMapper.selectPet();
        List<Pet> Pets2= petMapper.selectAllDepot();

        model.addAttribute("Pets", Pets);
        model.addAttribute("Pets2",Pets2);
        return "index";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String selectUser(Model model) {
        List<User> Users = userMapper.selectAll();
        model.addAttribute("Users", Users);
        return "user";
    }

    @RequestMapping(value = "/shop", method = RequestMethod.GET)
    public String shopAllPet(Model model) {
        List<Pet> Pets_2 = petMapper.selectAllShop();
        model.addAttribute("Pets_2", Pets_2);
        return "shopAllPet";
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String selectPetById(Model model){
        return "";
    }
}
