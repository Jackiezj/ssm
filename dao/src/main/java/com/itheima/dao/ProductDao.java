package com.itheima.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductDao {
    @Select("select * from product")
    List<Product> findAll();
}
