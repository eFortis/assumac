/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.DAO;

//import tg.efortis.assuma.entities.Employer;

import javax.ejb.Local;
import tg.assurence.entity.Employer;


/**
 *
 * @author amen
 */
@Local
public interface IEmployerDAO extends IDAO<Employer, Integer> {
    
}
