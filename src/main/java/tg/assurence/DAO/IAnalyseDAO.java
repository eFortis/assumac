/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.DAO;

import javax.ejb.Local;
import org.omg.CORBA.INTERNAL;
import tg.assurence.entity.Analyse;
//import tg.efortis.assuma.entities.Analyse;

/**
 *
 * @author amen
 */
@Local
public interface IAnalyseDAO extends IDAO<Analyse, Integer> {
    
}
