/*
 * To change this template, choose Tools | Templates
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
@Table(name = "policys")
public class Policy extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "wording")
    private String wording;
    
    @Column(name = "percent")
    private String percent;
    
    @OneToMany(mappedBy = "policy")
    private List<InsuranceServiceInsuredPolicy> policys = new LinkedList<InsuranceServiceInsuredPolicy>();
    
    @OneToMany(mappedBy = "policy")
    private List<PolicyType> polictyTypes = new LinkedList<PolicyType>();

    public Policy() {
    }

    public Policy(Integer id, String wording, String percent) {
        this.id = id;
        this.wording = wording;
        this.percent = percent;
    }

    public Policy(String wording, String percent) {
        this.wording = wording;
        this.percent = percent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWording() {
        return wording;
    }

    public void setWording(String wording) {
        this.wording = wording;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    public List<InsuranceServiceInsuredPolicy> getPolicys() {
        return policys;
    }

    public void setPolicys(List<InsuranceServiceInsuredPolicy> policys) {
        this.policys = policys;
    }

    public List<PolicyType> getPolictyTypes() {
        return polictyTypes;
    }

    public void setPolictyTypes(List<PolicyType> polictyTypes) {
        this.polictyTypes = polictyTypes;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Policy other = (Policy) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Policy{" + "id=" + id + ", wording=" + wording + ", percent=" + percent + ", policys=" + policys + ", polictyTypes=" + polictyTypes + '}';
    }
    
}
