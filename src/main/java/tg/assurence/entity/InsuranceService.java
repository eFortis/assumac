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
import tg.assurence.entity.BaseEntity;

/**
 *
 * @author amen
 */
@Entity
@Table(name = "insurance_services")
public class InsuranceService extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name = "service_name", nullable = false)
    private String serviceName;
    
     @Column(name = "adress", nullable = false)
    private String adress;
    
    @Column(name = "phone_number")
    private String phoneNumber;
    
    @OneToMany(mappedBy = "insuranceService")
    private List<InsuranceServiceInsuredPolicy> insuranceServices = new LinkedList<InsuranceServiceInsuredPolicy>();

    public InsuranceService() {
    }

    public InsuranceService(Integer id, String serviceName, String adress, String phoneNumber) {
        this.id = id;
        this.serviceName = serviceName;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }

    public InsuranceService(String serviceName, String adress, String phoneNumber) {
        this.serviceName = serviceName;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
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

    public List<InsuranceServiceInsuredPolicy> getInsuranceServices() {
        return insuranceServices;
    }

    public void setInsuranceServices(List<InsuranceServiceInsuredPolicy> insuranceServices) {
        this.insuranceServices = insuranceServices;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final InsuranceService other = (InsuranceService) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InsuranceService{" + "id=" + id + ", serviceName=" + serviceName + ", adress=" + adress + ", phoneNumber=" + phoneNumber + ", insuranceServices=" + insuranceServices + '}';
    }
 
}
