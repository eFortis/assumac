/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.realm;

import tg.assurence.DAO.UserDAOBeanLocal;
import tg.assurence.entity.Permission;
import tg.assurence.entity.Role;
import tg.assurence.entity.User;
import java.util.Set;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.Sha256CredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * The Spring/Hibernate sample application's one and only configured Apache
 * Shiro Realm.
 *
 * <p>Because a Realm is really just a security-specific DAO, we could have just
 * made Hibernate calls directly in the implementation and named it a
 * 'HibernateRealm' or something similar.</p>
 *
 * <p>But we've decided to make the calls to the database using a UserDAO, since
 * a DAO would be used in other areas of a 'real' application in addition to
 * here. We felt it better to use that same DAO to show code re-use.</p>
 *
 * @author komilo
 */
//@Stateless
//@LocalBean
public class EntityRealm extends AuthorizingRealm {

//    @EJB
    protected UserDAOBeanLocal userDAO;

    public EntityRealm() throws NamingException {
        setName("entityRealm"); //This name must match the name in the User class's getPrincipals() method
//        setCredentialsMatcher(new Sha256CredentialsMatcher());

        InitialContext context = new InitialContext();
        this.userDAO = (UserDAOBeanLocal) context
                .lookup("java:global/assuma-ca/UserDAOBean");
//                .lookup("java:global/tg.ucaouut.medoc_medoc-ear_ear_1.0-SNAPSHOT/medoc-security-ejb-1.0-SNAPSHOT/UserDAO")
        //com.mycompany_assurence_war_1.0-SNAPSHOTPU;
        System.out.println("realm; userDAO: " + this.userDAO);
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken)
            throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        User user = userDAO.findByUsername(token.getUsername());
        if (user != null) {
            return new SimpleAuthenticationInfo(user.getId(), user.getPassword(), getName());
        } else {
            return null;
        }
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        Long userId = (Long) principals.fromRealm(this.getName()).iterator().next();
        User user = userDAO.getOne(userId);
        if (user != null) {
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            for (Role role : user.getRoles()) {
                info.addRole(role.getName());
                Set<Permission> permissions = role.getPermissions();
                for (Permission permission : permissions) {
                    info.addStringPermission(permission.getId());
                }
            }
            return info;
        } else {
            return null;
        }
    }

    @Override
    public void clearCachedAuthorizationInfo(PrincipalCollection principals) {
        super.clearCachedAuthorizationInfo(principals);
    }
}
