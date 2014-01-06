/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.DAO.impl;
//
//import tg.efortis.assuma.dao.*;

import javax.ejb.Stateless;
import tg.assurence.DAO.IInsuredDAO;
import tg.assurence.entity.Insured;

//import tg.efortis.assuma.entities.Insured;

/**
 *
 * @author amen
 */
@Stateless
public class InsuredDAO extends DAO<Insured, Integer> implements IInsuredDAO {

    public InsuredDAO() {
        super(Insured.class);
    }
    
}
