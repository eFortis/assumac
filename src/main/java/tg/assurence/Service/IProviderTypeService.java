/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service;

//import tg.efortis.assuma.entities.ProviderType;

import javax.ejb.Local;
import tg.assurence.entity.ProviderType;


/**
 *
 * @author amen
 */
@Local
public interface IProviderTypeService extends ICRUDService<ProviderType, Integer> {
    
}
