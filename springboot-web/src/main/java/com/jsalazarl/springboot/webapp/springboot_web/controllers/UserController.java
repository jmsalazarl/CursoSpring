package com.jsalazarl.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.jsalazarl.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Jorge", "Salazar");
        user.setEmail("pruebas@gmail.com");
        model.addAttribute("title", "Hola Mundo....!!");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/listUsers")
    public String listUsers(ModelMap model){
        model.addAttribute("title", "Listado de usuarios pruebas Thymeleaf");
        return "listUsers";
    }
    
    @ModelAttribute("listUsers")
    public List<User> listUsersAtribute(){
        return Arrays.asList(
            new User("Juan", "Perez","pruebas@gmail.com"),
            new User("Jose", "Ranger"),
            new User("Maki", "Uzumaki"),
            new User("Yuji", "Itadori", "pruebas@gmail.com")
        );
    }
}
