/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;

//import tg.efortis.assuma.dao.IDAO;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import tg.assurence.DAO.IDAO;
import tg.assurence.DAO.IPrescriptionDAO;
import tg.assurence.DAO.impl.PrescriptionDAO;
import tg.assurence.Service.IPrescriptionService;
import tg.assurence.entity.Prescription;

/**
 *
 * @author amen
 */
@Stateless
public class PrescriptionService extends CRUDService<Prescription, Integer> implements IPrescriptionService {

    @EJB
    private IPrescriptionDAO dao;

    public PrescriptionService() {
    }
    
    
    @Override
    public IPrescriptionDAO getDAO() {
        return dao;
    }

    
}
