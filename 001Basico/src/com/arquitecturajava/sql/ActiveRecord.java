package com.arquitecturajava.sql;

import java.util.List;

public interface ActiveRecord {
    Object select();
    List selectAll();
    void insert();
    void delete();
    void update();
}