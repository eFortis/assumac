/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;
//
//import tg.efortis.assuma.daoImpl.CompanyDAO;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import tg.assurence.DAO.IDAO;
import tg.assurence.DAO.impl.CompanyDAO;
import tg.assurence.Service.ICompanyService;
import tg.assurence.entity.Company;
import javax.ejb.EJB;

//import tg.efortis.assuma.entities.Company;
//import tg.efortis.assuma.services.*;

/**
 *
 * @author amen
 */
@Stateless
public class CompanyService extends CRUDService<Company, Integer> implements ICompanyService {

    public CompanyService() {
    }

    @Override
    public IDAO<Company, Integer> getDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
