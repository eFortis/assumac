/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.DAO.impl;
//
//import tg.efortis.assuma.dao.*;

import javax.ejb.Stateless;
import tg.assurence.DAO.IEmployerDAO;
import tg.assurence.entity.Employer;

//import tg.efortis.assuma.entities.Employer;

/**
 *
 * @author amen
 */
@Stateless
public class EmployerDAO extends DAO<Employer, Integer> implements IEmployerDAO {

    public EmployerDAO() {
        super(Employer.class);
    }
    
}
