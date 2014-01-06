/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;

//import tg.efortis.assuma.dao.IDAO;

import javax.ejb.Stateless;
import tg.assurence.DAO.IDAO;
import tg.assurence.DAO.impl.PersonDAO;
import tg.assurence.Service.IPersonService;
import tg.assurence.entity.Person;

//import tg.efortis.assuma.daoImpl.PersonDAO;
//import tg.efortis.assuma.entities.Person;
//import tg.efortis.assuma.services.*;

/**
 *
 * @author amen
 */
@Stateless
public class PersonService extends CRUDService<Person, Integer> implements IPersonService {

    @Override
    public IDAO<Person, Integer> getDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
