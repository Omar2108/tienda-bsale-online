
package com.bsale.bsale.repository;

import com.bsale.bsale.bean.Products;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Omar rodriguez Chamorro
 * @version 1.0.0
 */
public interface ProductRepository extends CrudRepository<Products, Integer> {
    
    /**
     *
     * @param nameProduct
     * @return
     */
    @Query("SELECT p.id, p.name, p.urlImage, p.price, p.discount, p.category FROM Products p WHERE"+" CONCAT(p.name, p.price, p.category)"+" LIKE %?1%")
    public List findAll(@Param(value="nameProduct") String nameProduct);
    
}
