package com.arquitecturajava.poo.person;

public enum Extent {
    ACUTE("aguda"), 
    MEDIUM("media"),
    SERIOUS("grave");
    
    private String name;
    
    Extent(String name) {
        this.setName(name);
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}