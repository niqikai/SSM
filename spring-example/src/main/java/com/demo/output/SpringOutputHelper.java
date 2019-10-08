package com.demo.output;

public class SpringOutputHelper {
    private IOutputGenerator outputGenerator;

    public void generateOutput(){
        outputGenerator.generatorOutput();
    }

    public void setOutputGenerator(IOutputGenerator outputGenerator){
        this.outputGenerator = outputGenerator;
    }
}
