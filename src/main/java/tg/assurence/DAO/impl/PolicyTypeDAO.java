/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.DAO.impl;
//
//import tg.efortis.assuma.dao.*;

import javax.ejb.Stateless;
import tg.assurence.DAO.IPolicyTypeDAO;
import tg.assurence.entity.PolicyType;

//import tg.efortis.assuma.entities.PolicyType;

/**
 *
 * @author amen
 */
@Stateless
public class PolicyTypeDAO extends DAO<PolicyType, Integer> implements IPolicyTypeDAO {

    public PolicyTypeDAO() {
        super(PolicyType.class);
    }
    
}
