package com.mytsai.springbootmall.dao;

import com.mytsai.springbootmall.model.Product;

public interface ProductDao {

    Product getProductbyId(Integer productId);

}
