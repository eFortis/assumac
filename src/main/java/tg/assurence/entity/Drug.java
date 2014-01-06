/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author amen
 */
@Entity
@Table(name = "drugs")
@DiscriminatorValue(value = "D")
public class Drug extends PrescriptionType {

    public Drug() {
    }

    public Drug(Integer id, String wording) {
        super(id, wording);
    }
   
}
