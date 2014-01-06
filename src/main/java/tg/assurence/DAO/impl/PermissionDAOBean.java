/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.DAO.impl;

import tg.assurence.DAO.PermissionDAOBeanLocal;
import tg.assurence.entity.Permission;
import javax.ejb.Stateless;

/**
 *
 * @author komilo
 */
@Stateless
public class PermissionDAOBean extends DAO<Permission, String>
        implements PermissionDAOBeanLocal {

    public PermissionDAOBean() {
        super(Permission.class);
    }
}
