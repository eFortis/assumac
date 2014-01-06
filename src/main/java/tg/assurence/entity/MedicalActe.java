/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author amen
 */
@Entity
@Table(name = "medical_actes")
public class MedicalActe extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name = "wording", nullable = false)
    private String wording;

}
