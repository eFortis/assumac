/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service;
//
//import tg.efortis.assuma.entities.InsuranceServiceInsuredPolicy;

import javax.ejb.Local;
import tg.assurence.entity.InsuranceServiceInsuredPolicy;
import tg.assurence.entity.InsuranceServiceInsuredPolicyId;

//import tg.efortis.assuma.entities.InsuranceServiceInsuredPolicyId;

/**
 *
 * @author amen
 */
@Local
public interface IInsuranceServiceInsuredPolicyService extends ICRUDService<InsuranceServiceInsuredPolicy, InsuranceServiceInsuredPolicyId> {
    
}
