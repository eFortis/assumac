/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;

//import tg.efortis.assuma.daoImpl.PolicyTypeDAO;

import javax.ejb.Stateless;
import tg.assurence.DAO.IDAO;
import tg.assurence.DAO.impl.PolicyTypeDAO;
import tg.assurence.Service.IPolicyTypeService;
import tg.assurence.entity.PolicyType;

//import tg.efortis.assuma.entities.PolicyType;
//import tg.efortis.assuma.services.*;

/**
 *
 * @author amen
 */
@Stateless
public class PolicyTypeService extends CRUDService<PolicyType, Integer> implements IPolicyTypeService {

    @Override
    public IDAO<PolicyType, Integer> getDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
