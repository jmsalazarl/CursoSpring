package com.jsalazarl.springboot.webapp.springboot_web.models.dto;

public class ParamsDto {

    private String text;
    private Integer code;
    
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }

}
