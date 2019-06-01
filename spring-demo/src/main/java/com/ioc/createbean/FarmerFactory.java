package com.ioc.createbean;

import org.springframework.beans.factory.FactoryBean;

public class FarmerFactory implements FactoryBean<Farmer> {
    // instance factory method
    @Override
    public Farmer getObject() throws Exception {
        System.out.println("implements factoryBean");
        return new Farmer();
    }

    @Override
    public Class<?> getObjectType() {
        return Farmer.class;
    }
}
