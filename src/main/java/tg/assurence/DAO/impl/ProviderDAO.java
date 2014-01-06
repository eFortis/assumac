/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tg.assurence.DAO.impl;

//import tg.efortis.assuma.dao.*;

import javax.ejb.Stateless;
import tg.assurence.DAO.IProviderDAO;
import tg.assurence.entity.Provider;

//import tg.efortis.assuma.entities.Provider;

/**
 *
 * @author amen
 */
@Stateless
public class ProviderDAO extends DAO<Provider, Integer> implements IProviderDAO {

    public ProviderDAO() {
        super(Provider.class);
    }
    
    
}
