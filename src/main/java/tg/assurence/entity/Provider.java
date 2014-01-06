/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tg.assurence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author amen
 */
@Entity
@Table(name = "providers")
public class Provider extends BaseEntity{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "provider_name", nullable = false)
    private String providerName;
    
    @Column(name = "description", nullable = false)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    private ProviderType providerType;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Employer employer;
    
    public Provider() {
    }

    public Provider(Integer id, String providerName, String description, ProviderType providerType, Employer employer) {
        this.id = id;
        this.providerName = providerName;
        this.description = description;
        this.providerType = providerType;
        this.employer = employer;
    }

    public Provider(String providerName, String description, ProviderType providerType, Employer employer) {
        this.providerName = providerName;
        this.description = description;
        this.providerType = providerType;
        this.employer = employer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProviderType getProviderType() {
        return providerType;
    }

    public void setProviderType(ProviderType providerType) {
        this.providerType = providerType;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Provider other = (Provider) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Provider{" + "id=" + id + ", providerName=" + providerName + ", description=" + description + ", providerType=" + providerType + ", employer=" + employer + '}';
    }

    
    
}
