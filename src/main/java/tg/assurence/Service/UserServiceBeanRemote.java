/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service;

import javax.ejb.Local;
import tg.assurence.entity.Permission;
import tg.assurence.entity.Role;
import tg.assurence.entity.User;

/**
 *
 * @author komilo
 */
@Local
public interface UserServiceBeanRemote extends ICRUDService<User, Long> {

    User getCurrent();

    User findByUsername(String username);

    void enable(User user);

    void disable(User user);

    boolean userIsPermitted(String permission);

    boolean userIsPermitted(Permission permission);

    boolean userHasRole(String role);

    boolean userHasRole(Role role);
    
    boolean isUserPermitted(User user, Permission permission);
}
