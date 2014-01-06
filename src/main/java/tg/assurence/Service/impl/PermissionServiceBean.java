/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import tg.assurence.DAO.PermissionDAOBeanLocal;
import tg.assurence.Service.PermissionServiceBeanRemote;
import tg.assurence.entity.Permission;

/**
 *
 * @author komilo
 */
@Stateless
public class PermissionServiceBean extends CRUDService<Permission, String>
        implements PermissionServiceBeanRemote {
    
    @EJB
    private PermissionDAOBeanLocal entityDAO;
    
    public PermissionServiceBean() {
    }
    
    @Override
    public PermissionDAOBeanLocal getDAO() {
        return this.entityDAO;
    }
}
