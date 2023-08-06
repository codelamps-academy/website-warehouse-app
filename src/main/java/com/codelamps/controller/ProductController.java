package com.codelamps.controller;

import com.codelamps.entity.Product;
import com.codelamps.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 06/08/23
 * Time: 12.30
 * description: website-warehouse-smk-giripuro-sumpiuh
 */

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/warehouse")
public class ProductController {

    private final ProductService productService;

    @GetMapping("/product")
    public String showProduct(Model model){
        log.info("Menampilkan Product Warehouse.");
        List<Product> product = productService.getAllProduct();
        model.addAttribute("products", product);
        return "product";
    }
}
