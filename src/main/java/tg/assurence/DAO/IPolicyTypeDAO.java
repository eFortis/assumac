/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.DAO;

//import tg.efortis.assuma.entities.PolicyType;

import javax.ejb.Local;
import tg.assurence.entity.PolicyType;


/**
 *
 * @author amen
 */
@Local
public interface IPolicyTypeDAO extends IDAO<PolicyType, Integer> {
    
}
