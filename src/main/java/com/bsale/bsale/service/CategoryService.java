
package com.bsale.bsale.service;

import com.bsale.bsale.bean.Category;
import com.bsale.bsale.repository.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Omar rodriguez Chamorro
 * @version 1.0.0
 */

@Service
@Component
public class CategoryService implements ICategoryService{
    
    @Autowired 
    private CategoryRepository categoryRepository;
    
    @Override
    @Transactional(readOnly = true)
    public List<Category> listAll(){
        
        return (List<Category>) categoryRepository.findAll();
        
    }
    
    /**
     *
     * @param nameCategory
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public List listAllFromName(String nameCategory){
        
        return  categoryRepository.findAll(nameCategory);
        
    }
    
}
