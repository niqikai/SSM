package com.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ToString
public class FormBean {
    private List<Long> ids = new ArrayList<>();
}
