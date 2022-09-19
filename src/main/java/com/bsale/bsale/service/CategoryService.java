
package com.bsale.bsale.service;

import com.bsale.bsale.bean.Category;
import com.bsale.bsale.repository.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Contiene la logica de negocio que se va a ejecutar en el controlador
 * @author Omar rodriguez Chamorro
 * @version 1.0.0
 */

@Service
@Component
public class CategoryService implements ICategoryService{
    
    //representa la interfaz categoryRepository
    @Autowired 
    private CategoryRepository categoryRepository;
    
    /**
     * Retorna todos las categorias almacenados en la base de datos
     * @return 
     */
    @Override
    @Transactional(readOnly = true)
    public List<Category> listAll(){
        
        return (List<Category>) categoryRepository.findAll();
        
    }
    
    /**
     * Retorna todos las categorias que coincidan con el parametro ingresado
     * @param nameCategory
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public List listAllFromName(String nameCategory){
        
        return  categoryRepository.findAll(nameCategory);
        
    }
    
}
