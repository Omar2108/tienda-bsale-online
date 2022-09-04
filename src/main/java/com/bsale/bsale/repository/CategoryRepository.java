/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsale.bsale.repository;

import com.bsale.bsale.bean.Category;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Omar Rodriguez Chamorro
 * @version 1.0.0
 */
public interface CategoryRepository extends CrudRepository<Category, Integer> {
    
    /**
     *
     * @param nameCategory
     * @return
     */
    @Query("SELECT c.id, c.name FROM Category c WHERE c.name LIKE %?1%")
    public List findAll(@Param(value="nameCategory")String nameCategory);
    
}
