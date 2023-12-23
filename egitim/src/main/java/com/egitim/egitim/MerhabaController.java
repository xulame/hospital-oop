package com.egitim.egitim;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MerhabaController {
    @RequestMapping("/merhaba")
    public String merhaba(Model model) {
        String mesajicerigi="Merhaba Dünya";
        model.addAttribute("mesaj", mesajicerigi);

    }
}
