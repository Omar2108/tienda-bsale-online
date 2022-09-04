package com.bsale.bsale.controllers;

import com.bsale.bsale.bean.Category;
import com.bsale.bsale.bean.Products;
import com.bsale.bsale.service.CategoryService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.bsale.bsale.service.ProductService;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Omar Rodriguez Chamorro
 * @version 1.0.0
 */
@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT,RequestMethod.PATCH})
public class MainController {

    @Autowired
    private ProductService productService;
    
      @Autowired
    private CategoryService CategoryService;

    @GetMapping(path = "/v1/products/all")
    public @ResponseBody ArrayList<Products> findAll() {
        return (ArrayList<Products>) productService.listAll();
    }

    @GetMapping(path = "/v1/products/filter/{nameProduct}")
    public List filterNameProducts(@PathVariable String nameProduct) {
        return  productService.listAllFromName(nameProduct);
    }
    
    @GetMapping(path = "/v1/category/all")
    public ArrayList<Category> findAllCategory() {
        return  (ArrayList<Category>) CategoryService.listAll();
    }
    
    @GetMapping(path = "/v1/category/filter/{nameCategory}")
    public List filterNameCategory(@PathVariable String nameCategory) {
        
        return  CategoryService.listAllFromName(nameCategory);
    }

}
