package com.mytsai.springbootmall.service;

import com.mytsai.springbootmall.dto.CreateOrderRequest;
import com.mytsai.springbootmall.dto.OrderQueryParams;
import com.mytsai.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
