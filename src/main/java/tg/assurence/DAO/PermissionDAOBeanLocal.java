/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.DAO;

import tg.assurence.entity.Permission;
import javax.ejb.Local;

/**
 *
 * @author komilo
 */
@Local
public interface PermissionDAOBeanLocal extends IDAO<Permission, String> {
    
}
