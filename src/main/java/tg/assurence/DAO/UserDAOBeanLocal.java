/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.DAO;

import tg.assurence.entity.User;
import javax.ejb.Local;

/**
 *
 * @author komilo
 */
@Local
public interface UserDAOBeanLocal extends IDAO<User, Long> {

    User findByUsername(String username);
}
