package com.jsalazarl.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping({"", "/", "/home"})
    public String home(){
        // Redirije a una nueva ruta existente dentro del proyecto
        // puede ser dentro del mismo controlador o de otro controlador
        //return "redirect:/listUsers";

        // Redirije hacia metodos handler, actua como un despachador que
        // al redirijir no hace el refresh en la pagina te mantiene con misma
        // peticion http, sin perder los parametros del request solo despacha 
        // a otra accion (metodo) del controlador
        return "forward:/listUsers";
    }
}
