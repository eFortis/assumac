/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.DAO;

//import tg.efortis.assuma.entities.Prescription;

import javax.ejb.Local;
import tg.assurence.entity.Prescription;


/**
 *
 * @author amen
 */
@Local
public interface IPrescriptionDAO extends IDAO<Prescription, Integer> {
    
}
