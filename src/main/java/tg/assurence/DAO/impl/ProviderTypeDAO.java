/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tg.assurence.DAO.impl;

//import tg.efortis.assuma.dao.*;

import javax.ejb.Stateless;
import tg.assurence.DAO.IProviderTypeDAO;
import tg.assurence.entity.ProviderType;

//import tg.efortis.assuma.entities.ProviderType;

/**
 *
 * @author amen
 */
@Stateless
public class ProviderTypeDAO extends DAO<ProviderType, Integer> implements IProviderTypeDAO {

    public ProviderTypeDAO() {
        super(ProviderType.class);
    }
    
}
