/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service;

import javax.ejb.Local;
import tg.assurence.entity.Role;

/**
 *
 * @author komilo
 */
@Local
public interface RoleServiceBeanRemote extends ICRUDService<Role, Long> {
    
    Role getOneByName(String name);
}
