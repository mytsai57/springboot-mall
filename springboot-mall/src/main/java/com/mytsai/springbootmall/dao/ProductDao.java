package com.mytsai.springbootmall.dao;

import com.mytsai.springbootmall.constant.ProductCategory;
import com.mytsai.springbootmall.dto.ProductRequest;
import com.mytsai.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
