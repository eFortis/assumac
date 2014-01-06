/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;

//import tg.efortis.assuma.dao.IDAO;

import javax.ejb.Stateless;
import tg.assurence.DAO.IDAO;
import tg.assurence.DAO.impl.ProviderTypeDAO;
import tg.assurence.Service.IProviderTypeService;
import tg.assurence.entity.ProviderType;

//import tg.efortis.assuma.daoImpl.ProviderTypeDAO;
//import tg.efortis.assuma.entities.ProviderType;
//import tg.efortis.assuma.services.*;

/**
 *
 * @author amen
 */
@Stateless
public class ProviderTypeService extends CRUDService<ProviderType, Integer> implements IProviderTypeService {

    @Override
    public IDAO<ProviderType, Integer> getDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
