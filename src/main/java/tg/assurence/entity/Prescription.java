/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 package tg.assurence.entity;

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

/**
 *
 * @author amen
 */
@Entity
@Table(name = "prescriptions")
public class Prescription extends BaseEntity{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name = "quantity")
    private Integer quantity;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Prestation prestation;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private PrescriptionType prescriptionType;

    public Prescription() {
    }

    public Prescription(Integer id, Integer quantity, Prestation prestation, PrescriptionType prescriptionType) {
        this.id = id;
        this.quantity = quantity;
        this.prestation = prestation;
        this.prescriptionType = prescriptionType;
    }

    public Prescription(Integer quantity, Prestation prestation, PrescriptionType prescriptionType) {
        this.quantity = quantity;
        this.prestation = prestation;
        this.prescriptionType = prescriptionType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Prestation getPrestation() {
        return prestation;
    }

    public void setPrestation(Prestation prestation) {
        this.prestation = prestation;
    }

    public PrescriptionType getPrescriptionType() {
        return prescriptionType;
    }

    public void setPrescriptionType(PrescriptionType prescriptionType) {
        this.prescriptionType = prescriptionType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Prescription other = (Prescription) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Prescription{" + "id=" + id + ", quantity=" + quantity + ", prestation=" + prestation + ", prescriptionType=" + prescriptionType + '}';
    }
    
    
}
