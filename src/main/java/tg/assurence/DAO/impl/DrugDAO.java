/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.DAO.impl;

//import tg.efortis.assuma.dao.*;

import javax.ejb.Stateless;
import tg.assurence.DAO.IDrugDAO;
import tg.assurence.entity.Drug;

//import tg.efortis.assuma.entities.Drug;

/**
 *
 * @author amen
 */
@Stateless
public class DrugDAO extends DAO<Drug, Integer> implements IDrugDAO {

    public DrugDAO() {
        super(Drug.class);
    }
    
}
