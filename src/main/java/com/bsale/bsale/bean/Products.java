
package com.bsale.bsale.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Omar Rodriguez Chamorro
 * @version 1.0.0
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Products implements Serializable {
    
    @Id
    private Integer id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "url_image")
    private String urlImage;
    
    @Column(name = "price")
    private String price;
    
    @Column(name = "discount")
    private String discount;
    
    @Column(name = "category")
    private String category;
    
    
    
}
