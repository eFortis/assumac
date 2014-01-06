/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.DAO;

//import tg.efortis.assuma.entities.Policy;

import javax.ejb.Local;
import tg.assurence.entity.Policy;


/**
 *
 * @author amen
 */
@Local
public interface IPolicyDAO extends IDAO<Policy, Integer> {
    
}
