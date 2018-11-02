package com.swagger.controller;

import com.swagger.entity.Pet;
import com.swagger.mapper.PetMapper;
import javafx.concurrent.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/w")
public class WorkerController {

    @Autowired
    private PetMapper petMapper;


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        List<Pet> Pet = petMapper.selectAll();
        model.addAttribute("Pet", Pet);
        return "index";
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
