package com.arquitecturajava.sql;

import java.util.List;

public interface ActiveRecord {
    Object select();
    List selectAll();
    int insert();
    int delete();
    int update();
}