package com.mytsai.springbootmall.dao;

import com.mytsai.springbootmall.dto.ProductRequest;
import com.mytsai.springbootmall.model.Product;

public interface ProductDao {

    Product getProductbyId(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
