package com.mytsai.springbootmall.service.impl;

import com.mytsai.springbootmall.dao.ProductDao;
import com.mytsai.springbootmall.dao.impl.ProductDaoImpl;
import com.mytsai.springbootmall.dto.ProductRequest;
import com.mytsai.springbootmall.model.Product;
import com.mytsai.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductbyId(Integer productId){
        return productDao.getProductbyId(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
