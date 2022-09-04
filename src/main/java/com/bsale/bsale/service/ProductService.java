
package com.bsale.bsale.service;

import com.bsale.bsale.bean.Products;
import com.bsale.bsale.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Omar Rodriguez Chamorro
 * @version 1.0.0
 */

@Service
@Component
public class ProductService implements IProductService {
    
    @Autowired 
    private ProductRepository productRepository;
    
    @Transactional(readOnly = true)
    public List<Products> listAll(){
       
        return  (List<Products>) productRepository.findAll();
        
    }
    
    /**
     *
     * @param nameProduct
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public List listAllFromName(String nameProduct){
        
        return   productRepository.findAll(nameProduct);
        
    }

    
    
}
