/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service;

//import tg.efortis.assuma.entities.Person;

import javax.ejb.Local;
import tg.assurence.entity.Person;


/**
 *
 * @author amen
 */
@Local
public interface IPersonService extends ICRUDService<Person, Integer> {
    
}
