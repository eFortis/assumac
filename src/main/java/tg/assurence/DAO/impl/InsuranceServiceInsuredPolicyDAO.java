/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.DAO.impl;

//import tg.efortis.assuma.dao.*;

import javax.ejb.Stateless;
import tg.assurence.DAO.IInsuranceServiceInsuredPolicyDAO;
import tg.assurence.entity.InsuranceServiceInsuredPolicy;
import tg.assurence.entity.InsuranceServiceInsuredPolicyId;

//import tg.efortis.assuma.entities.InsuranceServiceInsuredPolicy;
//import tg.efortis.assuma.entities.InsuranceServiceInsuredPolicyId;

/**
 *
 * @author amen
 */
@Stateless
public class InsuranceServiceInsuredPolicyDAO extends DAO<InsuranceServiceInsuredPolicy, InsuranceServiceInsuredPolicyId> 
implements IInsuranceServiceInsuredPolicyDAO {

    public InsuranceServiceInsuredPolicyDAO() {
        super(InsuranceServiceInsuredPolicy.class);
    }
    
    
}
