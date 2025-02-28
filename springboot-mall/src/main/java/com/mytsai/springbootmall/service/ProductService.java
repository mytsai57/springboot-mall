package com.mytsai.springbootmall.service;

import com.mytsai.springbootmall.dto.ProductRequest;
import com.mytsai.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
