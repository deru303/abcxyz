package com.github.danrog303.shopee.products;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/")
    public String getMainPage(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        model.addAttribute("product", new Product());
        return "main-page";
    }

    @PostMapping("/add-new-product")
    public String handleProductCreation(@ModelAttribute Product product) {
        productService.createNewProduct(product);
        return "redirect:/";
    }
}
