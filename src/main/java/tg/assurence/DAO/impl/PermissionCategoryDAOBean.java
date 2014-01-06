/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.DAO.impl;

import tg.assurence.DAO.PermissionCategoryDAOBeanLocal;
import tg.assurence.entity.PermissionCategory;
import javax.ejb.Stateless;

/**
 *
 * @author komilo
 */
@Stateless
public class PermissionCategoryDAOBean extends DAO<PermissionCategory, String>
        implements PermissionCategoryDAOBeanLocal {

    public PermissionCategoryDAOBean() {
        super(PermissionCategory.class);
    }
}
