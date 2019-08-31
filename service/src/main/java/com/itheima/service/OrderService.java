package com.itheima.service;

import com.itheima.domain.Orders;

import java.util.List;

public interface OrderService {
    List<Orders> findAll(Integer page, Integer pageSize) throws Exception;

    Orders findById(String id) throws Exception;
}
