/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service;

//import tg.efortis.assuma.entities.InsuranceService;

import javax.ejb.Local;
import tg.assurence.entity.InsuranceService;


/**
 *
 * @author amen
 */
@Local
public interface IInsuranceServiceService extends ICRUDService<InsuranceService, Integer> {
    
}
