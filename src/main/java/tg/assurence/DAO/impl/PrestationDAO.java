/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tg.assurence.DAO.impl;

//import tg.efortis.assuma.dao.IPrestationDAO;

import javax.ejb.Stateless;
import tg.assurence.DAO.IPrestationDAO;
import tg.assurence.entity.Prestation;

//import tg.efortis.assuma.entities.Prestation;

/**
 *
 * @author amen
 */
@Stateless
public class PrestationDAO extends DAO<Prestation, Integer> implements IPrestationDAO {

    public PrestationDAO() {
        super(Prestation.class);
    }  
}
