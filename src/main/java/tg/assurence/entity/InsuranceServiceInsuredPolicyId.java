/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 package tg.assurence.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author amen
 */
@Embeddable
public class InsuranceServiceInsuredPolicyId implements Serializable{
    
    private Integer insuranceServiceId;
    private Integer insuredId;
    private Integer policyId;

    public InsuranceServiceInsuredPolicyId() {
    }

    public InsuranceServiceInsuredPolicyId(Integer insuranceServiceId, Integer insuredId, Integer policyId) {
        this.insuranceServiceId = insuranceServiceId;
        this.insuredId = insuredId;
        this.policyId = policyId;
    }

    public Integer getInsuranceServiceId() {
        return insuranceServiceId;
    }

    public void setInsuranceServiceId(Integer insuranceServiceId) {
        this.insuranceServiceId = insuranceServiceId;
    }

    public Integer getInsuredId() {
        return insuredId;
    }

    public void setInsuredId(Integer insuredId) {
        this.insuredId = insuredId;
    }

    public Integer getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Integer policyId) {
        this.policyId = policyId;
    }

}
