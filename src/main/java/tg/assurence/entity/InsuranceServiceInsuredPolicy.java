/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tg.assurence.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author amen
 */
@Entity
@Table(name = "insurance_service_insured_policys")
public class InsuranceServiceInsuredPolicy extends BaseEntity {
    
    @EmbeddedId
    private InsuranceServiceInsuredPolicyId id = new InsuranceServiceInsuredPolicyId();

    @Column(name = "start_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date startDate;
    
    @Column(name = "end_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date endDate;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "insurance_service_id", insertable = false, updatable = false)
    private InsuranceService insuranceService;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "insured_id", insertable = false, updatable = false)
    private Insured insured;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "policy_id", insertable = false, updatable = false)
    private Policy policy;
    
    public InsuranceServiceInsuredPolicy() {
    }

    public InsuranceServiceInsuredPolicy(Date startDate, InsuranceService insuranceService, Insured insured, Policy policy) {
        this.startDate = startDate;
        this.insuranceService = insuranceService;
        this.insured = insured;
        this.policy = policy;
    }

    public InsuranceServiceInsuredPolicy(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public InsuranceServiceInsuredPolicyId getId() {
        return id;
    }

    public void setId(InsuranceServiceInsuredPolicyId id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public InsuranceService getInsuranceService() {
        return insuranceService;
    }

    public void setInsuranceService(InsuranceService insuranceService) {
        this.insuranceService = insuranceService;
    }

    public Insured getInsured() {
        return insured;
    }

    public void setInsured(Insured insured) {
        this.insured = insured;
    }

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final InsuranceServiceInsuredPolicy other = (InsuranceServiceInsuredPolicy) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InsuranceServiceInsuredPolicy{" + "id=" + id + ", startDate=" + startDate + ", endDate=" + endDate + ", insuranceService=" + insuranceService + ", insured=" + insured + ", policy=" + policy + '}';
    }
    
    
}
