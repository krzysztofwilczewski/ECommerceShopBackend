package com.wilczewski.shop.product.controller;

import com.wilczewski.shop.product.model.Product;
import com.wilczewski.shop.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;



    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

}
