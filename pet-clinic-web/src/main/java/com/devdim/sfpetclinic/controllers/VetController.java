package com.devdim.sfpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by Dima on 7/30/2019.
 */
@Controller
@RequestMapping("/vets")
public class VetController {

    @RequestMapping({"", "/index", "/index.html"})
    public String listVets() {


        return "vets/index";
    }

}
