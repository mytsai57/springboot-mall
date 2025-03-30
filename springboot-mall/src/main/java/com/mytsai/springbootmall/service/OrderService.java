package com.mytsai.springbootmall.service;

import com.mytsai.springbootmall.dto.CreateOrderRequest;
import com.mytsai.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
