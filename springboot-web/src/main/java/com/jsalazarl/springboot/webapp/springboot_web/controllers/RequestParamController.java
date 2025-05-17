package com.jsalazarl.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsalazarl.springboot.webapp.springboot_web.models.dto.ParamDto;
import com.jsalazarl.springboot.webapp.springboot_web.models.dto.ParamsDto;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/params")
public class RequestParamController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "Mensaje por default") String message){
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }

    @GetMapping("/bar")
    public ParamsDto bar(@RequestParam(required = false, defaultValue = "text default") String text, 
    @RequestParam(required = false, defaultValue = "1") Integer code){
        ParamsDto params = new ParamsDto();
        params.setText(text);
        params.setCode(code);
        return params;
    }

    @GetMapping("/request")
    public ParamsDto request(HttpServletRequest request){
        Integer code = 0;
        try {
            code = request.getParameter("code")!=null ? Integer.parseInt(request.getParameter("code")) : 0;            
        } catch (Exception e) {
            e.getMessage();
        }
        ParamsDto params = new ParamsDto();
        params.setText(request.getParameter("text"));
        params.setCode(code);
        return params;
    }

}
