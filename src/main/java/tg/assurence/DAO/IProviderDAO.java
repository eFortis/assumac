/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tg.assurence.DAO;

//import tg.efortis.assuma.entities.Provider;

import javax.ejb.Local;
import tg.assurence.entity.Provider;


/**
 *
 * @author amen
 */
@Local
public interface IProviderDAO extends IDAO<Provider, Integer> {
    
}
