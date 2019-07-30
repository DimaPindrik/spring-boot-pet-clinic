package com.devdim.sfpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by Dima on 7/30/2019.
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index", "index.html"})
    public String  index() {

        return "index";
    }
}
