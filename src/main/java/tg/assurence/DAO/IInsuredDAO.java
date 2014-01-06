/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.DAO;

//import tg.efortis.assuma.entities.Insured;

import javax.ejb.Local;
import tg.assurence.entity.Insured;


/**
 *
 * @author amen
 */
@Local
public interface IInsuredDAO extends IDAO<Insured, Integer> {
    
}
