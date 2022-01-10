package com.hismission.controller;

import com.hismission.bean.Parish;
import com.hismission.service.ParishService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api/parish")
public class ParishController {

    private static final Logger LOG = LoggerFactory.getLogger(ParishController.class);

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

    @RequestMapping(value = "/saveparish",method = RequestMethod.POST)
    public String saveParish(@ModelAttribute("parish") Parish parish, Model model){
        Parish parishModel = parishService.saveParish(parish);
        LOG.debug("ParishController: save parish Object"+parishModel);
        model.addAttribute("parishes",parishService.getAllParishes());
        return "parishes";
    }
}
