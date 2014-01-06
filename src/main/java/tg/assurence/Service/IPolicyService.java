/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service;

////import tg.efortis.assuma.entities.Policy;

import javax.ejb.Local;
import tg.assurence.entity.Policy;


/**
 *
 * @author amen
 */
@Local
public interface IPolicyService extends ICRUDService<Policy, Integer> {
    
}
