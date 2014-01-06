/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;

//import tg.efortis.assuma.dao.IDAO;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import tg.assurence.DAO.IDAO;
import tg.assurence.DAO.IInsuredDAO;
import tg.assurence.DAO.impl.InsuredDAO;
import tg.assurence.Service.IInsuredService;
import tg.assurence.entity.Insured;

/**
 *
 * @author amen
 */
@Stateless
public class InsuredService extends CRUDService<Insured, Integer> implements IInsuredService {

    @EJB
     private IInsuredDAO dao;

    public InsuredService() {
    }
     
    @Override
    public IInsuredDAO getDAO() {
        return dao;
    }
    
}
