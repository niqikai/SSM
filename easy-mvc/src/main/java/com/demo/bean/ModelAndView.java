package com.demo.bean;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Setter
@Getter
public class ModelAndView {

    private String viewName;

    private Map<String, Object> model = new HashMap<>();


    public void addAttribute(String key, String value) {
        this.model.put(key, value);
    }
}
