
package com.bsale.bsale.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *Representa la tabla product de la base de datos
 * @author Omar Rodriguez Chamorro
 * @version 1.0.0
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Products implements Serializable {
    
    //representa el campo id de la tabla product
    @Id
    private Integer id;
    
    //representa el campo name de la tabla product
    @Column(name = "name")
    private String name;
    
    //representa el campo url_image de la tabla product
    @Column(name = "url_image")
    private String urlImage;
    
    //representa el campo price de la tabla product
    @Column(name = "price")
    private String price;
    
    //representa el campo discount de la tabla product
    @Column(name = "discount")
    private String discount;
    
    //representa el campo category de la tabla product
    @Column(name = "category")
    private String category;
    
    
    
}
