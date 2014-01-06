/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;

//import tg.efortis.assuma.daoImpl.EmployerDAO;

import javax.ejb.Stateless;
import tg.assurence.DAO.IDAO;
import tg.assurence.DAO.impl.EmployerDAO;
import tg.assurence.Service.IEmployerService;
import tg.assurence.entity.Employer;

//import tg.efortis.assuma.entities.Employer;
//import tg.efortis.assuma.services.*;

/**
 *
 * @author amen
 */
@Stateless
public class EmployerService extends CRUDService<Employer, Integer> implements IEmployerService {

    @Override
    public IDAO<Employer, Integer> getDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
