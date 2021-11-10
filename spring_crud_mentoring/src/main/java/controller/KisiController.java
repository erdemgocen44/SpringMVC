package controller;

import org.springframework.web.bind.annotation.RestController;

import service.KisiService;

@RestController
public class KisiController {

    public KisiService kisiService;

    public KisiController(KisiService kisiService) {
        this.kisiService = kisiService;
    }

}
