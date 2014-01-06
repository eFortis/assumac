/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.beans;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.apache.shiro.SecurityUtils;
import tg.assurence.Service.RoleServiceBeanRemote;
import tg.assurence.Service.UserServiceBeanRemote;
import tg.assurence.entity.Role;
import tg.assurence.entity.User;

/**
 *
 * @author komilo
 */
@ManagedBean
@RequestScoped
public class UserBean implements Serializable{
    
    @EJB
    private UserServiceBeanRemote userService;
    
    @EJB
    private RoleServiceBeanRemote roleService;
    
    private User user;

    /**
     * Creates a new instance of ClientBean
     */
    public UserBean() {
        this.user = new User();
    }
    
    public List<User> getList() {
        return this.userService.getAll();
    }
    
    public String save() {
        this.userService.saveOne(user);
        return "liste?faces-redirect=true";
    }
    
    public String delete(Long idClient) {
        this.userService.deleteOne(idClient);
        return "liste?faces-redirect=true";
    }
    
    public String cancel() {
        return "liste?faces-redirect=true";
    }
    
    public List<Role> getAllRoles() {
        return this.roleService.getAll("name");
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public void logout() {
        SecurityUtils.getSubject().logout();
//        FacesContext.invalidateSession();
//        Faces.redirect(HOME_URL);
    }
}
