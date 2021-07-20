package com.arquitecturajava.apis.wrapper;

import java.util.ArrayList;
import java.util.List;

class Bag<T> {

    private static final int MAX_ELEMENTS = 3;
    private List<T> list = new ArrayList<>();
    
    void addObject(T object) {
        if (this.list.size() < Bag.MAX_ELEMENTS) {
            this.list.add(object);
        }
    }
    
    void removeString(T object) {
        this.list.remove(object);
    }
    
    void showList() {
        this.list.forEach(object -> System.out.println(object.toString()));
    }
}