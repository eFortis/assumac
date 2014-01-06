/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.crypto.hash.Sha256Hash;
import tg.assurence.DAO.UserDAOBeanLocal;
import tg.assurence.Service.UserServiceBeanRemote;
import tg.assurence.entity.Permission;
import tg.assurence.entity.Role;
import tg.assurence.entity.User;

/**
 *
 * @author komilo
 */
@Stateless
public class UserServiceBean extends CRUDService<User, Long>
        implements UserServiceBeanRemote {
    
    @EJB
    private UserDAOBeanLocal entityDAO;

    public UserServiceBean() {
    }
    
    @Override
    public UserDAOBeanLocal getDAO() {
        return this.entityDAO;
    }

    @Override
    public synchronized User saveOne(User t) {
        t.setPassword(new Sha256Hash(t.getPassword()).toHex());
        return super.saveOne(t);
    }

    @Override
    public synchronized User updateOne(User t) {
        t.setPassword(new Sha256Hash(t.getPassword()).toHex());
        return super.updateOne(t);
    }

    @Override
    public synchronized User getCurrent() {
        return this.getOne((Long)SecurityUtils.getSubject().getPrincipal());
    }

    @Override
    public synchronized boolean userIsPermitted(Permission permission) {
        return this.userIsPermitted(permission.getId());
    }

    @Override
    public synchronized boolean userIsPermitted(String permissionId) {
        return SecurityUtils.getSubject().isPermitted(permissionId);
    }

    @Override
    public synchronized boolean userHasRole(Role role) {
        return this.userHasRole(role.getName());
    }

    @Override
    public synchronized boolean userHasRole(String role) {
        return SecurityUtils.getSubject().hasRole(role);
    }

    @Override
    public synchronized void disable(User user) {
        user.setEnabled(false);
        this.getDAO().updateOne(user);
    }

    @Override
    public synchronized void enable(User user) {
        user.setEnabled(true);
        this.getDAO().updateOne(user);
    }

    @Override
    public synchronized User findByUsername(String username) {
        return this.entityDAO.findByUsername(username);
    }
    
    @Override
    public synchronized boolean isUserPermitted(User user, Permission permission){
        for (Role role : user.getRoles()) {
           if (role.getPermissions().contains(permission)) {
               return true;
           }
        }  
        return false;
    }
}
