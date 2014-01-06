/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import tg.assurence.DAO.RoleDAOBeanLocal;
import tg.assurence.Service.RoleServiceBeanRemote;
import tg.assurence.entity.Role;

/**
 *
 * @author komilo
 */
@Stateless
public class RoleServiceBean extends CRUDService<Role, Long>
    implements RoleServiceBeanRemote {
    
    @EJB
    private RoleDAOBeanLocal entityDAO;
    
    public RoleServiceBean() {
    }
    
    @Override
    public RoleDAOBeanLocal getDAO() {
        return this.entityDAO;
    }

    @Override
    public Role getOneByName(String name) {
        try {
            return this.entityDAO.getOneByName(name);
        } catch (NoResultException ex) {
            return null;
        }
    }
}
