/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tg.assurence.DAO;

//import tg.efortis.assuma.entities.Prestation;

import javax.ejb.Local;
import tg.assurence.entity.Prestation;


/**
 *
 * @author amen
 */
@Local
public interface IPrestationDAO extends IDAO<Prestation, Integer> {
    
}
