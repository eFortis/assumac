/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import tg.assurence.Service.PermissionServiceBeanRemote;
import tg.assurence.Service.RoleServiceBeanRemote;
import tg.assurence.entity.Permission;
import tg.assurence.entity.Role;

/**
 *
 * @author komilo
 */
@ManagedBean
@RequestScoped
public class RoleBean implements Serializable{
    
    @EJB
    private RoleServiceBeanRemote roleService;
    
    @EJB
    private PermissionServiceBeanRemote permissionService;
    
    private Role role;
    
    private List<Role> selectedRoles = new ArrayList<Role>();

    /**
     * Creates a new instance of ClientBean
     */
    public RoleBean() {
        this.role = new Role();
    }
    
    public List<Role> getList() {
        return this.roleService.getAll();
    }
    
    public String save() {
        this.roleService.saveOne(role);
        return "liste?faces-redirect=true";
    }
    
    public String delete(Long idClient) {
        this.roleService.deleteOne(idClient);
        return "liste?faces-redirect=true";
    }
    
    public String cancel() {
        return "liste?faces-redirect=true";
    }
    
    public List<Permission> getAllPermissions() {
        return this.permissionService.getAll("category.defaultWording");
    }

    public List<Role> getSelectedRoles() {
        return selectedRoles;
    }

    public void setSelectedRoles(List<Role> selectedRoles) {
        this.selectedRoles = selectedRoles;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
