/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service;

//import tg.efortis.assuma.entities.Provider;

import javax.ejb.Local;
import tg.assurence.entity.Provider;


/**
 *
 * @author amen
 */
@Local
public interface IProviderService extends ICRUDService<Provider, Integer> {
    
}
