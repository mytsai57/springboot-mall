package com.mytsai.springbootmall.service;

import com.mytsai.springbootmall.dto.ProductRequest;
import com.mytsai.springbootmall.model.Product;

public interface ProductService {

    Product getProductbyId(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
