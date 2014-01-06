


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import tg.assurence.DAO.IDAO;
import tg.assurence.DAO.IDrugDAO;
import tg.assurence.DAO.impl.DrugDAO;
import tg.assurence.Service.IDrugService;
import tg.assurence.entity.Drug;

/**
 *
 * @author amen
 */
@Stateless
public class DrugService extends CRUDService<Drug, Integer> implements IDrugService {

    @EJB
    private IDrugDAO dao;

    public DrugService() {
    }
    
    @Override
    public IDrugDAO getDAO() {
        return dao;
    }
  
}
