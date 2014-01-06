/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service;

//import tg.efortis.assuma.entities.Prestation;

import javax.ejb.Local;
import tg.assurence.entity.Prestation;


/**
 *
 * @author amen
 */
@Local
public interface IPrestationService extends ICRUDService<Prestation, Integer> {
    
}
