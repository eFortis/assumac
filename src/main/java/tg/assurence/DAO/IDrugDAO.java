/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.DAO;

//import tg.efortis.assuma.entities.Drug;

import javax.ejb.Local;
import tg.assurence.entity.Drug;


/**
 *
 * @author amen
 */
@Local
public interface IDrugDAO extends IDAO<Drug, Integer>{
    
}
