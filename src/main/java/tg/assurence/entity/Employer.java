/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tg.assurence.entity;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author amen
 */

@Entity
@Table(name = "employers")
@DiscriminatorValue(value = "E")
public class Employer extends Person{

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user ;
    
    @OneToMany(mappedBy = "employer")
    private List<Provider> providers = new LinkedList<Provider>();
    
    @OneToMany(mappedBy = "employer")
    private List<Prestation> prestations = new LinkedList<Prestation>();
 
    public Employer() {
    }

    public Employer(Integer id, String lastName, String firstName, String phoneNumber, String adress, String gender, Date birthday) {
        super(id, lastName, firstName, phoneNumber, adress, gender, birthday);
    }

    public Employer(String lastName, String firstName, String phoneNumber, String adress, String gender, Date birthday) {
        super(lastName, firstName, phoneNumber, adress, gender, birthday);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Provider> getProviders() {
        return providers;
    }

    public void setProviders(List<Provider> providers) {
        this.providers = providers;
    }

    public List<Prestation> getPrestations() {
        return prestations;
    }

    public void setPrestations(List<Prestation> prestations) {
        this.prestations = prestations;
    }

    String getNomComplet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
