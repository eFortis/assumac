/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service;

import javax.ejb.Local;
import tg.assurence.entity.PermissionCategory;

/**
 *
 * @author komilo
 */
@Local
public interface PermissionCategoryServiceBeanRemote extends ICRUDService<PermissionCategory, String> {
    
}
