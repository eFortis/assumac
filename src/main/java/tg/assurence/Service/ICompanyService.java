/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service;

//import tg.efortis.assuma.entities.Company;

import javax.ejb.Local;
import tg.assurence.entity.Company;


/**
 *
 * @author amen
 */
@Local
public interface ICompanyService extends ICRUDService<Company, Integer> {
    
}
