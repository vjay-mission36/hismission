package com.hismission.controller;

import com.hismission.bean.Parishnor;
import com.hismission.service.ParishnerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/parishnor")
public class ParishnorController {

    private static final Logger LOG = LoggerFactory.getLogger(ParishnorController.class);
    public static final String PARISHNOR_LIST ="parishnorslist";

    @Autowired
    private ParishnerService parishnorService;

    @GetMapping("/addparishnor")
    public String saveParishnor(Model model){
       model.addAttribute("parishnor", new Parishnor());
       return "addparishnor";
    }

    @RequestMapping(value = "/saveparishnor", method = RequestMethod.POST)
    public String saveParishnor(@ModelAttribute("parishnor") Parishnor parishnor, Model model){
        LOG.debug("process of the creating the Parishnor :"+parishnor.getFirstName() +" "+parishnor.getLastName());

        List<Parishnor> parishnors = parishnorService.saveParishnor(parishnor);
        model.addAttribute("parishnors",parishnors);
        return PARISHNOR_LIST;
    }


}
