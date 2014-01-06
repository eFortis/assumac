/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;

//import tg.efortis.assuma.daoImpl.ProviderDAO;

import tg.assurence.DAO.IDAO;
import tg.assurence.DAO.impl.ProviderDAO;
import tg.assurence.Service.IProviderService;
import tg.assurence.entity.Provider;
/**
 *
 * @author amen
 */
public class ProviderService extends CRUDService<Provider, Integer> implements IProviderService {

    @Override
    public IDAO<Provider, Integer> getDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
