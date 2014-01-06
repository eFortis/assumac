/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tg.assurence.DAO.impl;

//import tg.efortis.assuma.dao.ICompanyDAO;

import javax.ejb.Stateless;
import tg.assurence.DAO.ICompanyDAO;
import tg.assurence.entity.Company;

//import tg.efortis.assuma.entities.Company;

/**
 *
 * @author amen
 */
 
@Stateless
public class CompanyDAO extends DAO<Company, Integer> implements ICompanyDAO {

    public CompanyDAO() {
        super(Company.class);
    }
    
}
