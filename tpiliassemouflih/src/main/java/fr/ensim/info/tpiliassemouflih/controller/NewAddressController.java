package fr.ensim.info.tpiliassemouflih.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewAddressController {
    @GetMapping("/adresse")
    public String greeting() {
        return "adresse";
    }
}
