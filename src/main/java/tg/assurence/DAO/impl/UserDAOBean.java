/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.DAO.impl;

import tg.assurence.DAO.UserDAOBeanLocal;
import tg.assurence.entity.Role;
import tg.assurence.entity.User;
import java.util.HashSet;
import java.util.Set;
import javax.ejb.Stateless;
import javax.persistence.NoResultException;

/**
 *
 * @author komilo
 */
@Stateless
public class UserDAOBean extends DAO<User, Long> implements UserDAOBeanLocal {
    
    public UserDAOBean() {
        super(User.class);
    }

    /**
     * Renvoie l'utilisateur correspondant au username passé en paramètre.
     *
     * @param username Le nom d'utilisateur.
     * @return l'objet User correspondant.
     */
    @Override
    public User findByUsername(String username) {
        try {
        String query = "SELECT u FROM User u WHERE u.enabled=:enabled AND u.username=:username";
        return (User) em.createQuery(query)
                .setParameter("enabled", Boolean.TRUE)
                .setParameter("username", username)
                .getSingleResult();
        } catch (NoResultException ex) {
            return null;
        }
    }

    @Override
    public User saveOne(User t) {
        Set<Role> roles = new HashSet<Role>();
        for (Role role : t.getRoles()) {
            roles.add(this.em.merge(role));
        }
        t.setRoles(roles);
        return super.saveOne(t);
    }
}
