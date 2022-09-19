
package com.bsale.bsale.service;

import com.bsale.bsale.bean.Category;
import java.util.List;

/**
 * Contiene los metodo minimos a implementarse en la clase CategoryService
 * @author Omar rodriguez Chamorro
 * @version 1.0.0
 */
public interface ICategoryService {
    
    /**
     * Retorna todos los producto
     * @return 
     */
    public List<Category> listAll();
    
    /**
     * retorna una lista de producto que coincidan con la palabra ingresada
     * @param nameProduct
     * @return 
     */
    
    public List<Category> listAllFromName(String nameProduct);
    
}
