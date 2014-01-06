/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;

//import tg.efortis.assuma.daoImpl.PrestationDAO;

import javax.ejb.Stateless;
import tg.assurence.DAO.IDAO;
import tg.assurence.DAO.impl.PrestationDAO;
import tg.assurence.Service.IPrestationService;
import tg.assurence.entity.Prestation;

//import tg.efortis.assuma.entities.Prestation;
//import tg.efortis.assuma.services.*;

/**
 *
 * @author amen
 */
@Stateless
public class PrestationService extends CRUDService<Prestation, Integer> implements IPrestationService {

    @Override
    public IDAO<Prestation, Integer> getDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
