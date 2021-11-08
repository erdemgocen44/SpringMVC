package com.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SonucController {
    
    @RequestMapping("submit")
    public String islemYap(@RequestParam("sayi1") int s1,@RequestParam("sayi2") int s2, Model m) {

m.addAttribute("numbersToplam",s1+s2);
m.addAttribute("numbersCarpim",s1*s2);


        return "sonuc";
    }
}
