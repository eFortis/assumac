/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service;

import javax.ejb.Local;
import tg.assurence.entity.Permission;

/**
 *
 * @author komilo
 */
@Local
public interface PermissionServiceBeanRemote extends ICRUDService<Permission, String> {
    
}
