package com.github.danrog303.shopee.products;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductApiController {
    private final ProductService productService;

    @GetMapping("/api/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/api/products/{productId}")
    public Product getProductById(@PathVariable Long productId) {
        return productService.getProductById(productId);
    }

    @DeleteMapping("/api/products/{productId}")
    public String deleteProductById(@PathVariable Long productId) {
        productService.deleteProductById(productId);
        return "rekord usunięty!";
    }

    @PostMapping("/api/products")
    public Product createProduct(@RequestBody Product productToCreate) {
        productService.createNewProduct(productToCreate);
        return productToCreate;
    }
}
