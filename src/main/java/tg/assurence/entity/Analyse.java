/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package  tg.assurence.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author amen
 */
@Entity
@Table(name = "analyses")
@DiscriminatorValue(value = "A")
public class Analyse extends PrescriptionType{

    public Analyse() {
    }

    public Analyse(Integer id, String wording) {
        super(id, wording);
    }    
}
