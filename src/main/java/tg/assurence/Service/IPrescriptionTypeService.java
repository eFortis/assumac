/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service;

//import tg.efortis.assuma.entities.PrescriptionType;

import javax.ejb.Local;
import tg.assurence.entity.PrescriptionType;


/**
 *
 * @author amen
 */
@Local
public interface IPrescriptionTypeService extends ICRUDService<PrescriptionType, Integer> {
    
}
