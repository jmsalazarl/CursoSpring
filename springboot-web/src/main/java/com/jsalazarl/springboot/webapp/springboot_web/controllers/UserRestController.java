package com.jsalazarl.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsalazarl.springboot.webapp.springboot_web.models.User;
import com.jsalazarl.springboot.webapp.springboot_web.models.dto.UserDto;


@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details(){
        User user = new User("Jorge", "Salazar");
        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo....!!");

        return userDto;
    }

    /**
     * Metodo que retorna un MAP utilizado para retornar valores en un JSON
     * @return Map<String, Object>
     */
    @GetMapping("/details-map")
    public Map<String, Object> detailsMap(){
        Map<String, Object> body = new HashMap<>();
        User user = new User("Jorge", "Salazar");
        body.put("title", "Hola Mundo....!!");
        body.put("user", user);

        return body;
    }
    
    @GetMapping("/listUsers")
    public List<User> listUsers(){
        User user = new User("Juan", "Perez");
        User user2 = new User("Pepe", "Roys");
        User user3 = new User("Jose", "Mendez");
        List<User> listUsers = Arrays.asList(user, user2, user3);

        return listUsers;
    }
}
