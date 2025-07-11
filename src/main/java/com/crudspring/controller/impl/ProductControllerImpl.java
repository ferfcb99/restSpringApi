package com.crudspring.controller.impl;

import com.crudspring.controller.ProductController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/products")
public class ProductControllerImpl implements ProductController {

    public ProductControllerImpl() {}

    @Override
    @GetMapping(value = "/get-by-id/{id}")
    public String getProductNameById(@PathVariable("id") Long id){ // end - point
        if(id == 1){
            return "Coca-Cola";
        }else if(id == 2){
            return "Pepsi";
        }
        return "Unknown";
    }

    @Override
    @GetMapping(value = "/get-even-numbers")
    public int[] getEvenNumbers(){ // end - point
        int[] evenNumbers = {2,4,6,8,10};
        return evenNumbers;
    }


}
