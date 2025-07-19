package com.crudspring.service.impl;

import com.crudspring.dto.ProductDto;
import com.crudspring.service.ProductSevice;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductSevice {

    @Override
    public ProductDto saveProduct(ProductDto productDto) {
        productDto.setId(3);
        return productDto;
    }
}
// data tranfer object - just a class