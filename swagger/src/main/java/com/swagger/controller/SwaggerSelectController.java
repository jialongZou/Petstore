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
@RequestMapping("/")
public class SwaggerSelectController {

    @Autowired
    private PetMapper petMapper;

    @Autowired
    private UserMapper userMapper;


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        List<Pet> Pets = petMapper.selectPet();
        model.addAttribute("Pets", Pets);
        return "index";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String selectUser(Model model) {
        List<User> Users = userMapper.selectAll();
        model.addAttribute("Users", Users);
        return "user";
    }


    /*@RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public String add(@RequestBody List<Worker> list) {
        int c = workerMapper.add(list);
        if (c > 0)
            return "{\"msg\":\"ok\"}";
        return "{\"msg\":\"no\"}";
    }

    @RequestMapping(value = "/del/{id}", method = RequestMethod.GET)
    public String del(@PathVariable("id") int id) {
        workerMapper.deleteByPrimaryKey(id);
        return "redirect:/w/index";
    }

    @RequestMapping(value = "/delNull")
    public String delNull() {
        workerMapper.deleteByIdIsNull();
        return "";
    }*/

}
