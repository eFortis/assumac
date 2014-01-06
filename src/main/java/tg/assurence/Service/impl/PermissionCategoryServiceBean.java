/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import tg.assurence.DAO.PermissionCategoryDAOBeanLocal;
import tg.assurence.Service.PermissionCategoryServiceBeanRemote;
import tg.assurence.entity.PermissionCategory;

/**
 *
 * @author komilo
 */
@Stateless
public class PermissionCategoryServiceBean extends CRUDService<PermissionCategory, String>
        implements PermissionCategoryServiceBeanRemote {
    
    @EJB
    private PermissionCategoryDAOBeanLocal entityDAO;
    
    public PermissionCategoryServiceBean() {
    }
    
    @Override
    public PermissionCategoryDAOBeanLocal getDAO() {
        return this.entityDAO;
    }
}
