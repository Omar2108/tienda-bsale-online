
package com.bsale.bsale.service;

import com.bsale.bsale.bean.Products;
import com.bsale.bsale.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Contiene la logica de negocio que se va a ejecutar en el controlador
 * @author Omar Rodriguez Chamorro
 * @version 1.0.0
 */

@Service
@Component
public class ProductService implements IProductService {
    
    //representa la interfaz productRepository
    @Autowired 
    private ProductRepository productRepository;
    
    /**
     * Retorna todos los productos almacenados
     * @return 
     */
    @Transactional(readOnly = true)
    public List<Products> listAll(){
       
        return  (List<Products>) productRepository.findAll();
        
    }
    
    /**
     * Retorna todos los registros que coincidan con el parametro ingresado
     * @param nameProduct
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public List listAllFromName(String nameProduct){
        
        return   productRepository.findAll(nameProduct);
        
    }

    
    
}
