package com.itheima.service;

import com.itheima.dao.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll() throws Exception;

    void save(Product product) throws Exception;
}
