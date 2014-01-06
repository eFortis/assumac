/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;

//import tg.efortis.assuma.daoImpl.PrescriptionTypeDAO;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import tg.assurence.DAO.IDAO;
import tg.assurence.DAO.IPrescriptionDAO;
import tg.assurence.DAO.IPrescriptionTypeDAO;
import tg.assurence.DAO.impl.PrescriptionTypeDAO;
import tg.assurence.Service.IPrescriptionTypeService;
import tg.assurence.entity.PrescriptionType;


/**
 *
 * @author amen
 */
@Stateless
public class PrescriptionTypeService extends CRUDService<PrescriptionType, Integer> implements IPrescriptionTypeService {

    @EJB
    private IPrescriptionTypeDAO dao ;

    public PrescriptionTypeService() {
    }
    
    @Override
    public IPrescriptionTypeDAO getDAO() {
        return dao;
    }

    
}
