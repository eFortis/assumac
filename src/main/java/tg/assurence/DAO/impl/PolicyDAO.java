/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.DAO.impl;

//import tg.efortis.assuma.dao.*;

import javax.ejb.Stateless;
import tg.assurence.DAO.IPolicyDAO;
import tg.assurence.entity.Policy;

//import tg.efortis.assuma.entities.Policy;

/**
 *
 * @author amen
 */
@Stateless
public class PolicyDAO extends DAO<Policy, Integer> implements IPolicyDAO{

    public PolicyDAO() {
        super(Policy.class);
    }
    
}
