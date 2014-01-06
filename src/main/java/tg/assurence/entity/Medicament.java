/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author kpizia
 */
@Entity
@Table(name="medicament")
public class Medicament extends BaseEntity{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "libelle", nullable = false)
    private String libelle;
    
    @Column(name = "dosage", nullable = false)
    private String dosage ;

    public Medicament() {
    }

    public Medicament(String libelle, String dosage) {
        this.libelle = libelle;
        this.dosage = dosage;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    @Override
    public String toString() {
        return "Medicament{" + "id=" + id + ", libelle=" + libelle + ", dosage=" + dosage + '}';
    }
    
}
