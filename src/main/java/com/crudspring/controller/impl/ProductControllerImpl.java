package com.crudspring.controller.impl;

import com.crudspring.controller.ProductController;
import com.crudspring.dto.ProductDto;
import com.crudspring.service.ProductSevice;
import com.crudspring.service.impl.ProductServiceImpl;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/products")
public class ProductControllerImpl implements ProductController {

    private final ProductSevice productSevice;

    public ProductControllerImpl(ProductSevice productSevice) {
        this.productSevice = productSevice;
    }

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


    @Override
    @GetMapping(value = "/get-not-even-numbers")
    public List<Integer> notEvenNumbers(){
        List<Integer> notEvenNumbers = new ArrayList<>(); // 1 3 5 7 9 11 13 15
        for(int i = 1; i <= 20; i++){
            if(i % 2 != 0){
                notEvenNumbers.add(i);
            }
        }
        return notEvenNumbers;
    }

    /*
    * GET - to obtain information
    * POST - Save information
    * */
    @PostMapping(value = "/save-product", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ProductDto saveProduct(@RequestBody ProductDto productDto){
        return productSevice.saveProduct(productDto);
    }




}
