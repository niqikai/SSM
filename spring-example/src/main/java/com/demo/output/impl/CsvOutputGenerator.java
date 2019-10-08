package com.demo.output.impl;

import com.demo.output.IOutputGenerator;

public class CsvOutputGenerator implements IOutputGenerator {
    @Override
    public void generatorOutput() {
        System.out.println("Csv Output Generator");
    }
}
