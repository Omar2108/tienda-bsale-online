/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsale.bsale.service;

import com.bsale.bsale.bean.Products;
import java.util.List;

/**
 *
 * @author Omar Rodriguez Chamorro
 * @version 1.0.0
 */
public interface IProductService {
    
    
    
    public List listAllFromName(String nameProduct);
    
}
