/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tg.assurence.entity;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author amen
 */
@Entity
@Table(name = "prestations")
public class Prestation extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name = "prestation_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date prestationDate;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Insured insured;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Employer employer;
    
    @OneToMany(mappedBy = "prestation")
    private List<Prescription> prescriptions = new LinkedList<Prescription>();
      
    public Prestation() {
    }

    public Prestation(Integer id, Date prestationDate, Insured insured) {
        this.id = id;
        this.prestationDate = prestationDate;
        this.insured = insured;
    }

    public Prestation(Integer id, Date prestationDate, Insured insured, Employer employer) {
        this.id = id;
        this.prestationDate = prestationDate;
        this.insured = insured;
        this.employer = employer;
    }

    public Prestation(Date prestationDate, Insured insured, Employer employer) {
        this.prestationDate = prestationDate;
        this.insured = insured;
        this.employer = employer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getPrestationDate() {
        return prestationDate;
    }

    public void setPrestationDate(Date prestationDate) {
        this.prestationDate = prestationDate;
    }

    public Insured getInsured() {
        return insured;
    }

    public void setInsured(Insured insured) {
        this.insured = insured;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(List<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Prestation other = (Prestation) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Prestation{" + "id=" + id + ", prestationDate=" + prestationDate + ", insured=" + insured + ", employer=" + employer + ", prescriptions=" + prescriptions + '}';
    }
   
}
