/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;


import javax.ejb.Stateless;
import tg.assurence.DAO.IDAO;
import tg.assurence.DAO.impl.InsuranceServiceDAO;
import tg.assurence.Service.IInsuranceServiceService;
import tg.assurence.entity.InsuranceService;


/**
 *
 * @author amen
 */
@Stateless
public class InsuranceServiceService extends CRUDService<InsuranceService, Integer> implements IInsuranceServiceService {

    @Override
    public IDAO<InsuranceService, Integer> getDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
