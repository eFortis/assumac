/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 package tg.assurence.entity;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author amen
 */
@Entity
@Table(name = "companies")
public class Company extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "company_name", nullable = false)
    private String companyName;
    
    @Column(name = "adress", nullable = false)
    private String adress;
    
    @Column(name = "phoneNumber")
    private String phoneNumber;
    
    @OneToMany(mappedBy = "company")
    private List<Insured> insureds = new LinkedList<Insured>();

    public Company() {
    }

    public Company(Integer id, String companyName, String adress, String phoneNumber) {
        this.id = id;
        this.companyName = companyName;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }

    public Company(String companyName, String adress, String phoneNumber) {
        this.companyName = companyName;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Insured> getInsureds() {
        return insureds;
    }

    public void setInsureds(List<Insured> insureds) {
        this.insureds = insureds;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Company other = (Company) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Company{" + "id=" + id + ", companyName=" + companyName + ", adress=" + adress + ", phoneNumber=" + phoneNumber + ", insureds=" + insureds + '}';
    }
   
}
