package com.itheima.controller;

import com.itheima.domain.Product;
import com.itheima.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll () throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Product> productList = productService.findAll();
        mv.setViewName("product-list");
        mv.addObject("productList", productList);
        return mv;
    }

    @RequestMapping("/save.do")
    public String save (Product product) throws Exception {
        productService.save(product);
        return "redirect:findAll.do";
    }
}
