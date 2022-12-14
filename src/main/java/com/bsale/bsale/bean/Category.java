
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
 * Representa la tabla categoria en la base de datos
 * @author Omar Rodriguez Chamorro
 * @version 1.0.0
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "category")
public class Category implements Serializable {
    
    //representa el campo id de la tabla category
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    //representa el campo name de la tabla category
    @Column(name = "name")
    private String name;
    
    
    
}
