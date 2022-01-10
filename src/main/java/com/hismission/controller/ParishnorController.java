package com.hismission.controller;

import com.hismission.bean.Parishnor;
import com.hismission.service.ParishnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/parishnor")
public class ParishnorController {

    @Autowired
    private ParishnerService parishnorService;

    @GetMapping("/addparishnor")
    public String saveParishnor(Model model){
       model.addAttribute("parishnor", new Parishnor());
       return "addparishnor";
    }
}
