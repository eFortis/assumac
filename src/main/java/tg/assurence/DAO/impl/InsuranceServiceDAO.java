/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tg.assurence.DAO.impl;

//import tg.efortis.assuma.dao.IInsuranceServiceDAO;

import javax.ejb.Stateless;
import tg.assurence.DAO.IInsuranceServiceDAO;
import tg.assurence.entity.InsuranceService;

//import tg.efortis.assuma.entities.InsuranceService;

/**
 *
 * @author amen
 */
@Stateless
public class InsuranceServiceDAO extends DAO<InsuranceService, Integer> implements IInsuranceServiceDAO {

    public InsuranceServiceDAO() {
        super(InsuranceService.class);
    }
   
}
