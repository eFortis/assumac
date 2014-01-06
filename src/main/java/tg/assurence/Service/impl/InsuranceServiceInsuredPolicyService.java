/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;

//import tg.efortis.assuma.dao.IDAO;

import javax.ejb.Stateless;
import tg.assurence.DAO.IDAO;
import tg.assurence.DAO.impl.InsuranceServiceInsuredPolicyDAO;
import tg.assurence.Service.IInsuranceServiceInsuredPolicyService;
import tg.assurence.entity.InsuranceServiceInsuredPolicy;
import tg.assurence.entity.InsuranceServiceInsuredPolicyId;

//import tg.efortis.assuma.daoImpl.InsuranceServiceInsuredPolicyDAO;
//import tg.efortis.assuma.entities.InsuranceServiceInsuredPolicy;
//import tg.efortis.assuma.entities.InsuranceServiceInsuredPolicyId;
//import tg.efortis.assuma.services.*;

/**
 *
 * @author amen
 */
@Stateless
public class InsuranceServiceInsuredPolicyService extends CRUDService<InsuranceServiceInsuredPolicy, InsuranceServiceInsuredPolicyId> 
implements IInsuranceServiceInsuredPolicyService {

    @Override
    public IDAO<InsuranceServiceInsuredPolicy, InsuranceServiceInsuredPolicyId> getDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
