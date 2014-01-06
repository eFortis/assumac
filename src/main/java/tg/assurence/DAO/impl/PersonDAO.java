/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tg.assurence.DAO.impl;
//
//import tg.efortis.assuma.dao.IPersonDAO;

import javax.ejb.Stateless;
import tg.assurence.DAO.IPersonDAO;
import tg.assurence.entity.Person;

//import tg.efortis.assuma.entities.Person;

/**
 *
 * @author amen
 */
@Stateless
public class PersonDAO extends DAO<Person, Integer> implements IPersonDAO {

    public PersonDAO() {
        super(Person.class);
    }    
    
}
