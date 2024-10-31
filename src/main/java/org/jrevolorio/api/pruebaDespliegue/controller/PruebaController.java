package org.jrevolorio.api.pruebaDespliegue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pruebaDespliegue/v1/prueba")
public class PruebaController {

    @GetMapping("/saludo")
    public String saludo() {

        return "<h1>Jorge Abraham Revolorio Mazariegos</h1>";

    }

}
