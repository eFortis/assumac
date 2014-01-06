/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.DAO.impl;

import tg.assurence.DAO.RoleDAOBeanLocal;
import tg.assurence.entity.Permission;
import tg.assurence.entity.Role;
import java.util.HashSet;
import java.util.Set;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author komilo
 */
@Stateless
public class RoleDAOBean extends DAO<Role, Long> implements RoleDAOBeanLocal {
    
    public RoleDAOBean() {
        super(Role.class);
    }

    @Override
    public Role saveOne(Role t) {
        Set<Permission> permissions = new HashSet<Permission>();
        for (Permission permission : t.getPermissions()) {
            permissions.add(this.em.merge(permission));
        }
        t.setPermissions(permissions);
        return super.saveOne(t);
    }

    @Override
    public Role getOneByName(String name) {
        Query query = em.createQuery("SELECT r FROM Role r WHERE r.name = :name");
        query.setParameter("name", name);        
        return (Role) query.getSingleResult();
    }
}
