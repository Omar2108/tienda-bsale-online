
package com.bsale.bsale.service;

import java.util.List;

/**
 * Contiene los metodo minimos a implementarse en la clase ProductService
 * @author Omar Rodriguez Chamorro
 * @version 1.0.0
 */
public interface IProductService {
    
    /**
     * Retorna todos los productos que coincidan la palabra ingresada
     * @param nameProduct
     * @return 
     */    
    public List listAllFromName(String nameProduct);
    
}
