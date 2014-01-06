/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;

//import tg.efortis.assuma.dao.IDAO;

import javax.ejb.Stateless;
import tg.assurence.DAO.IDAO;
import tg.assurence.DAO.impl.PolicyDAO;
import tg.assurence.Service.IPolicyService;
import tg.assurence.entity.Policy;

//import tg.efortis.assuma.daoImpl.PolicyDAO;
//import tg.efortis.assuma.entities.Policy;
//import tg.efortis.assuma.services.*;

/**
 *
 * @author amen
 */
@Stateless
public class PolicyService extends CRUDService<Policy, Integer> implements IPolicyService {

    @Override
    public IDAO<Policy, Integer> getDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
