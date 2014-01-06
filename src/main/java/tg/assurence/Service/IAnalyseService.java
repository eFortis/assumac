/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service;

//import tg.efortis.assuma.entities.Analyse;

import javax.ejb.Local;
import tg.assurence.entity.Analyse;


/**
 *
 * @author amen
 */
@Local
public interface IAnalyseService extends ICRUDService<Analyse, Integer> {
    
}
