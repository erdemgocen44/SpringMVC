package controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import service.KisiService;

@RestController
public class KisiController {

    public KisiService kisiService;

    public KisiController(KisiService kisiService) {
        this.kisiService = kisiService;
    }

    @GetMapping(path = "/kisiler")

    public List<Kisi> kisileriGetir() {
        return kisiService.tumKisileriGetir();
    }

}
