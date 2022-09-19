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
 * controlador de la api
 * @author Omar Rodriguez Chamorro
 * @version 1.0.0
 */
@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT,RequestMethod.PATCH})
public class MainController {
    
    //representa la clase productService
    @Autowired
    private ProductService productService;
    
    //representa la clase categoryService
    @Autowired
    private CategoryService CategoryService;

    //path de tipo get que retorna todos los productos almacenados en la tabla product
    @GetMapping(path = "/v1/products/all")
    public @ResponseBody ArrayList<Products> findAll() {
        return (ArrayList<Products>) productService.listAll();
    }

    //path de tipo get que retorna los productos que coincidan con el nombre del producto ingresado, recibe un parametro de tipo string
    @GetMapping(path = "/v1/products/filter/{nameProduct}")
    public List filterNameProducts(@PathVariable String nameProduct) {
        return  productService.listAllFromName(nameProduct);
    }
    
    //path de tipo get que retorna todos las categorias almacenados en la tabla category
    @GetMapping(path = "/v1/category/all")
    public ArrayList<Category> findAllCategory() {
        return  (ArrayList<Category>) CategoryService.listAll();
    }
    
     //path de tipo get que retorna las categorias que coincidan con el nombre de la categoria ingresado, recibe un parametro de tipo string
    @GetMapping(path = "/v1/category/filter/{nameCategory}")
    public List filterNameCategory(@PathVariable String nameCategory) {
        
        return  CategoryService.listAllFromName(nameCategory);
    }

}
