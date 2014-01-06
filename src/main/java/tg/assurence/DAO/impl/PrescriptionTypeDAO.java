/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.DAO.impl;

//import tg.efortis.assuma.dao.*;

import javax.ejb.Stateless;
import tg.assurence.DAO.IPrescriptionTypeDAO;
import tg.assurence.entity.PrescriptionType;

//import tg.efortis.assuma.entities.PrescriptionType;

/**
 *
 * @author amen
 */
@Stateless
public class PrescriptionTypeDAO extends DAO<PrescriptionType, Integer> implements IPrescriptionTypeDAO {

    public PrescriptionTypeDAO() {
        super(PrescriptionType.class);
    }
    
}
