package com.hismission.controller;

import com.hismission.bean.Parish;
import com.hismission.service.ParishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api/parish")
public class ParishController {
    @Autowired
    private ParishService parishService;

    @GetMapping("/")
    public String index(){
        return "Welcome to Parish";
    }

    @GetMapping("{id}")
    public Parish getParishById(@PathVariable Long id) {
        return parishService.findById(id);
    }

    @GetMapping("/addparish")
    public String addParish(Model model){
        model.addAttribute("parish",new Parish());
        return "addparish";
    }

    @PostMapping("/saveparish")
    public ModelAndView saveParish(@ModelAttribute Parish parish){
        //latter we can save
        ModelAndView modelandview = new ModelAndView();

        Parish parishModel = parishService.saveParish(parish);
        modelandview.addObject("parish",parishModel);
        modelandview.setViewName("addparish");
        return modelandview;
    }

}
