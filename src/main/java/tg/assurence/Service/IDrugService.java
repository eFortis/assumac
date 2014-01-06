/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service;

//import tg.efortis.assuma.entities.Drug;

import javax.ejb.Local;
import tg.assurence.entity.Drug;


/**
 *
 * @author amen
 */
@Local
public interface IDrugService extends ICRUDService<Drug, Integer> {
    
}
