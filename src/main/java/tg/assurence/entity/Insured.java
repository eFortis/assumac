/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.entity;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author amen
 */
@Entity
@Table(name = "insureds")
@DiscriminatorValue(value = "I")
public class Insured extends Person {

    @OneToMany(mappedBy = "insured")
    private List<InsuranceServiceInsuredPolicy> insureds = new LinkedList<InsuranceServiceInsuredPolicy>();
    
    @OneToMany(mappedBy = "insured")
    private List<Prestation> prestations = new LinkedList<Prestation>();
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Company company;

    public Insured() {
    }

    public Insured(Integer id, String lastName, String firstName, String phoneNumber, String adress, String gender, Date birthday) {
        super(id, lastName, firstName, phoneNumber, adress, gender, birthday);
    }

    public Insured(String lastName, String firstName, String phoneNumber, String adress, String gender, Date birthday) {
        super(lastName, firstName, phoneNumber, adress, gender, birthday);
    }

    public Insured(Company company) {
        this.company = company;
    }

    public List<Prestation> getPrestations() {
        return prestations;
    }

    public void setPrestations(List<Prestation> prestations) {
        this.prestations = prestations;
    }

 
    public List<InsuranceServiceInsuredPolicy> getInsureds() {
        return insureds;
    }

    public void setInsureds(List<InsuranceServiceInsuredPolicy> insureds) {
        this.insureds = insureds;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

}
