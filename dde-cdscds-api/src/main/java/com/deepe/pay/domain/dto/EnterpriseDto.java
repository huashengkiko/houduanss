package com.deepe.pay.domain.dto;

import com.deepe.pay.domain.eo.Enterprise;
import java.util.Collection;
import java.util.List;

/**
* @desc enterprise
* @author admin
*/
public class EnterpriseDto extends Enterprise{

public EnterpriseDto(){};

public EnterpriseDto(Enterprise eo) {
    this.setName(eo.getName());
    this.setType(eo.getType());
    this.setArea(eo.getArea());
    this.setStatus(eo.getStatus());
    this.setAddress(eo.getAddress());
    this.setDutyParagraph(eo.getDutyParagraph());
    this.setCreatedBy(eo.getCreatedBy());
    this.setCreatedTime(eo.getCreatedTime());
    this.setUpdatedBy(eo.getUpdatedBy());
    this.setUpdatedTime(eo.getUpdatedTime());
    this.setUsername(eo.getUsername());
    this.setPassword(eo.getPassword());
    this.setPhone(eo.getPhone());
    this.setBusinessNature(eo.getBusinessNature());
    this.setProvince(eo.getProvince());
    this.setCity(eo.getCity());
    this.setContact(eo.getContact());
    this.setDepartment(eo.getDepartment());
    this.setPosition(eo.getPosition());
    this.setBusinessPhone(eo.getBusinessPhone());
    this.setBusinessPost(eo.getBusinessPost());
    this.setFax(eo.getFax());
    this.setWebsite(eo.getWebsite());
    this.setEmail(eo.getEmail());
    this.setBank(eo.getBank());
    this.setBankAccount(eo.getBankAccount());
    this.setAlias(eo.getAlias());
    this.setRemark(eo.getRemark());
    this.setTrustee(eo.getTrustee());
    this.setTrusteePhone(eo.getTrusteePhone());
    this.setTrusteeDepartment(eo.getTrusteeDepartment());
    this.setTrusteeIdCard(eo.getTrusteeIdCard());
    this.setIdCardUrl(eo.getIdCardUrl());
    this.setIdCardUrlNegative(eo.getIdCardUrlNegative());
    this.setAttorney(eo.getAttorney());
    this.setThreeCertificates(eo.getThreeCertificates());
    this.setUscc(eo.getUscc());
    this.setLegalRepresentative(eo.getLegalRepresentative());
    this.setFunds(eo.getFunds());
    this.setStartTime(eo.getStartTime());
    this.setEndTime(eo.getEndTime());
    this.setLongEffective(eo.getLongEffective());
    this.setEstablishmentDate(eo.getEstablishmentDate());
    this.setResidence(eo.getResidence());
    this.setBusinessScope(eo.getBusinessScope());
    this.setLicenseRemark(eo.getLicenseRemark());
    this.setBusinessLicenseUrl(eo.getBusinessLicenseUrl());
    this.setLegalIdCardUrl(eo.getLegalIdCardUrl());
    this.setLegalIdCardUrlNegative(eo.getLegalIdCardUrlNegative());
    this.setBusinessCode(eo.getBusinessCode());
    this.setBusinessName(eo.getBusinessName());
    this.setEffectiveDate(eo.getEffectiveDate());
    this.setDeadline(eo.getDeadline());
    this.setBusinessLongEffective(eo.getBusinessLongEffective());
    this.setBusinessMethod(eo.getBusinessMethod());
    this.setLegal(eo.getLegal());
    this.setPrincipal(eo.getPrincipal());
    this.setBusinessResidence(eo.getBusinessResidence());
    this.setBusinessPlace(eo.getBusinessPlace());
    this.setBusinessRange(eo.getBusinessRange());
    this.setStoreAddress(eo.getStoreAddress());
    this.setAnnexUrl(eo.getAnnexUrl());
    this.setRole(eo.getRole());
    this.setId(eo.getId());
    this.setNumber(eo.getNumber());
}
}

