package com.deepe.pay.domain.eo;


import java.util.Date;
import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Collection;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;


/**
* @desc enterprise
* @author admin
*/
//@ApiModel(description = "企业 -供应商-医院")
public class Enterprise{

// @ApiModelProperty(value = "企业名称")
    @TableField(value = "`name`")
    private String name;
// @ApiModelProperty(value = "企业类型")
    @TableField(value = "`type`")
    private String type;
// @ApiModelProperty(value = "所属地区")
    @TableField(value = "`area`")
    private String area;
// @ApiModelProperty(value = "状态")
    @TableField(value = "`status`")
    private String status;
// @ApiModelProperty(value = "企业地址")
    @TableField(value = "`address`")
    private String address;
// @ApiModelProperty(value = "税号")
    @TableField(value = "`duty_paragraph`")
    private String dutyParagraph;
// @ApiModelProperty(value = "创建人")
    @TableField(value = "`CREATED_BY`")
    private String createdBy;
// @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`CREATED_TIME`")
    private Date createdTime;
// @ApiModelProperty(value = "更新人")
    @TableField(value = "`UPDATED_BY`")
    private String updatedBy;
// @ApiModelProperty(value = "更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`UPDATED_TIME`")
    private Date updatedTime;
// @ApiModelProperty(value = "用户名")
    @TableField(value = "`username`")
    private String username;
// @ApiModelProperty(value = "密码")
    @TableField(value = "`password`")
    private String password;
// @ApiModelProperty(value = "手机号")
    @TableField(value = "`phone`")
    private String phone;
// @ApiModelProperty(value = "企业性质")
    @TableField(value = "`business_nature`")
    private String businessNature;
// @ApiModelProperty(value = "省份")
    @TableField(value = "`province`")
    private String province;
// @ApiModelProperty(value = "城市")
    @TableField(value = "`city`")
    private String city;
// @ApiModelProperty(value = "联系人")
    @TableField(value = "`contact`")
    private String contact;
// @ApiModelProperty(value = "部门")
    @TableField(value = "`department`")
    private String department;
// @ApiModelProperty(value = "职务")
    @TableField(value = "`position`")
    private String position;
// @ApiModelProperty(value = "企业电话")
    @TableField(value = "`business_phone`")
    private String businessPhone;
// @ApiModelProperty(value = "企业邮编")
    @TableField(value = "`business_post`")
    private String businessPost;
// @ApiModelProperty(value = "企业传真")
    @TableField(value = "`fax`")
    private String fax;
// @ApiModelProperty(value = "企业网址")
    @TableField(value = "`website`")
    private String website;
// @ApiModelProperty(value = "企业邮箱")
    @TableField(value = "`email`")
    private String email;
// @ApiModelProperty(value = "开户行")
    @TableField(value = "`bank`")
    private String bank;
// @ApiModelProperty(value = "银行账户")
    @TableField(value = "`bank_account`")
    private String bankAccount;
// @ApiModelProperty(value = "企业简称")
    @TableField(value = "`alias`")
    private String alias;
// @ApiModelProperty(value = "备注")
    @TableField(value = "`remark`")
    private String remark;
// @ApiModelProperty(value = "受托人")
    @TableField(value = "`trustee`")
    private String trustee;
// @ApiModelProperty(value = "受托人手机号")
    @TableField(value = "`trustee_phone`")
    private String trusteePhone;
// @ApiModelProperty(value = "受托人部门")
    @TableField(value = "`trustee_department`")
    private String trusteeDepartment;
// @ApiModelProperty(value = "受托人身份证号码")
    @TableField(value = "`trustee_id_card`")
    private String trusteeIdCard;
// @ApiModelProperty(value = "受托人身份证正面")
    @TableField(value = "`id_card_url`")
    private String idCardUrl;
// @ApiModelProperty(value = "受托人身份证反面")
    @TableField(value = "`id_card_url_negative`")
    private String idCardUrlNegative;
// @ApiModelProperty(value = "委托书")
    @TableField(value = "`attorney`")
    private String attorney;
// @ApiModelProperty(value = "是否三证合一")
    @TableField(value = "`three_certificates`")
    private Boolean threeCertificates;
// @ApiModelProperty(value = "统一社会信用代码")
    @TableField(value = "`uscc`")
    private String uscc;
// @ApiModelProperty(value = "法定代表人")
    @TableField(value = "`legal_representative`")
    private String legalRepresentative;
// @ApiModelProperty(value = "注册资金")
    @TableField(value = "`funds`")
    private String funds;
// @ApiModelProperty(value = "生效时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`start_time`")
    private Date startTime;
// @ApiModelProperty(value = "结束时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`end_time`")
    private Date endTime;
// @ApiModelProperty(value = "是否长期有效")
    @TableField(value = "`long_effective`")
    private Boolean longEffective;
// @ApiModelProperty(value = "成立日期")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`establishment_date`")
    private Date establishmentDate;
// @ApiModelProperty(value = "住所")
    @TableField(value = "`residence`")
    private String residence;
// @ApiModelProperty(value = "经营范围")
    @TableField(value = "`business_scope`")
    private String businessScope;
// @ApiModelProperty(value = "证照备注")
    @TableField(value = "`license_remark`")
    private String licenseRemark;
// @ApiModelProperty(value = "营业执照")
    @TableField(value = "`business_license_url`")
    private String businessLicenseUrl;
// @ApiModelProperty(value = "法人身份证正面")
    @TableField(value = "`legal_id_card_url`")
    private String legalIdCardUrl;
// @ApiModelProperty(value = "法人身份证反面")
    @TableField(value = "`legal_id_card_url_negative`")
    private String legalIdCardUrlNegative;
// @ApiModelProperty(value = "经营许可编号")
    @TableField(value = "`business_code`")
    private String businessCode;
// @ApiModelProperty(value = "名称")
    @TableField(value = "`business_name`")
    private String businessName;
// @ApiModelProperty(value = "生效日期")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`effective_date`")
    private Date effectiveDate;
// @ApiModelProperty(value = "截止日期")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`deadline`")
    private Date deadline;
// @ApiModelProperty(value = "是否长期有效")
    @TableField(value = "`business_long_effective`")
    private Boolean businessLongEffective;
// @ApiModelProperty(value = "经营方式")
    @TableField(value = "`business_method`")
    private String businessMethod;
// @ApiModelProperty(value = "法人")
    @TableField(value = "`legal`")
    private String legal;
// @ApiModelProperty(value = "企业负责人")
    @TableField(value = "`principal`")
    private String principal;
// @ApiModelProperty(value = "住所")
    @TableField(value = "`business_residence`")
    private String businessResidence;
// @ApiModelProperty(value = "经营场所")
    @TableField(value = "`business_place`")
    private String businessPlace;
// @ApiModelProperty(value = "经营范围")
    @TableField(value = "`business_range`")
    private String businessRange;
// @ApiModelProperty(value = "库房地址")
    @TableField(value = "`store_address`")
    private String storeAddress;
// @ApiModelProperty(value = "附件url")
    @TableField(value = "`annex_url`")
    private String annexUrl;
// @ApiModelProperty(value = "类型 医院 0 供应商 1 生产商  2")
    @TableField(value = "`role`")
    private Boolean role;
// @ApiModelProperty(value = "id")
    @TableId
    @TableField(value = "`id`")
    private String id;
// @ApiModelProperty(value = "企业编号")
    @TableField(value = "`number`")
    private String number;

    public void setName(String name){
    this.name = name;
    }

    public String getName(){
    return this.name;
    }

    public void setType(String type){
    this.type = type;
    }

    public String getType(){
    return this.type;
    }

    public void setArea(String area){
    this.area = area;
    }

    public String getArea(){
    return this.area;
    }

    public void setStatus(String status){
    this.status = status;
    }

    public String getStatus(){
    return this.status;
    }

    public void setAddress(String address){
    this.address = address;
    }

    public String getAddress(){
    return this.address;
    }

    public void setDutyParagraph(String dutyParagraph){
    this.dutyParagraph = dutyParagraph;
    }

    public String getDutyParagraph(){
    return this.dutyParagraph;
    }

    public void setCreatedBy(String createdBy){
    this.createdBy = createdBy;
    }

    public String getCreatedBy(){
    return this.createdBy;
    }

    public void setCreatedTime(Date createdTime){
    this.createdTime = createdTime;
    }

    public Date getCreatedTime(){
    return this.createdTime;
    }

    public void setUpdatedBy(String updatedBy){
    this.updatedBy = updatedBy;
    }

    public String getUpdatedBy(){
    return this.updatedBy;
    }

    public void setUpdatedTime(Date updatedTime){
    this.updatedTime = updatedTime;
    }

    public Date getUpdatedTime(){
    return this.updatedTime;
    }

    public void setUsername(String username){
    this.username = username;
    }

    public String getUsername(){
    return this.username;
    }

    public void setPassword(String password){
    this.password = password;
    }

    public String getPassword(){
    return this.password;
    }

    public void setPhone(String phone){
    this.phone = phone;
    }

    public String getPhone(){
    return this.phone;
    }

    public void setBusinessNature(String businessNature){
    this.businessNature = businessNature;
    }

    public String getBusinessNature(){
    return this.businessNature;
    }

    public void setProvince(String province){
    this.province = province;
    }

    public String getProvince(){
    return this.province;
    }

    public void setCity(String city){
    this.city = city;
    }

    public String getCity(){
    return this.city;
    }

    public void setContact(String contact){
    this.contact = contact;
    }

    public String getContact(){
    return this.contact;
    }

    public void setDepartment(String department){
    this.department = department;
    }

    public String getDepartment(){
    return this.department;
    }

    public void setPosition(String position){
    this.position = position;
    }

    public String getPosition(){
    return this.position;
    }

    public void setBusinessPhone(String businessPhone){
    this.businessPhone = businessPhone;
    }

    public String getBusinessPhone(){
    return this.businessPhone;
    }

    public void setBusinessPost(String businessPost){
    this.businessPost = businessPost;
    }

    public String getBusinessPost(){
    return this.businessPost;
    }

    public void setFax(String fax){
    this.fax = fax;
    }

    public String getFax(){
    return this.fax;
    }

    public void setWebsite(String website){
    this.website = website;
    }

    public String getWebsite(){
    return this.website;
    }

    public void setEmail(String email){
    this.email = email;
    }

    public String getEmail(){
    return this.email;
    }

    public void setBank(String bank){
    this.bank = bank;
    }

    public String getBank(){
    return this.bank;
    }

    public void setBankAccount(String bankAccount){
    this.bankAccount = bankAccount;
    }

    public String getBankAccount(){
    return this.bankAccount;
    }

    public void setAlias(String alias){
    this.alias = alias;
    }

    public String getAlias(){
    return this.alias;
    }

    public void setRemark(String remark){
    this.remark = remark;
    }

    public String getRemark(){
    return this.remark;
    }

    public void setTrustee(String trustee){
    this.trustee = trustee;
    }

    public String getTrustee(){
    return this.trustee;
    }

    public void setTrusteePhone(String trusteePhone){
    this.trusteePhone = trusteePhone;
    }

    public String getTrusteePhone(){
    return this.trusteePhone;
    }

    public void setTrusteeDepartment(String trusteeDepartment){
    this.trusteeDepartment = trusteeDepartment;
    }

    public String getTrusteeDepartment(){
    return this.trusteeDepartment;
    }

    public void setTrusteeIdCard(String trusteeIdCard){
    this.trusteeIdCard = trusteeIdCard;
    }

    public String getTrusteeIdCard(){
    return this.trusteeIdCard;
    }

    public void setIdCardUrl(String idCardUrl){
    this.idCardUrl = idCardUrl;
    }

    public String getIdCardUrl(){
    return this.idCardUrl;
    }

    public void setIdCardUrlNegative(String idCardUrlNegative){
    this.idCardUrlNegative = idCardUrlNegative;
    }

    public String getIdCardUrlNegative(){
    return this.idCardUrlNegative;
    }

    public void setAttorney(String attorney){
    this.attorney = attorney;
    }

    public String getAttorney(){
    return this.attorney;
    }

    public void setThreeCertificates(Boolean threeCertificates){
    this.threeCertificates = threeCertificates;
    }

    public Boolean getThreeCertificates(){
    return this.threeCertificates;
    }

    public void setUscc(String uscc){
    this.uscc = uscc;
    }

    public String getUscc(){
    return this.uscc;
    }

    public void setLegalRepresentative(String legalRepresentative){
    this.legalRepresentative = legalRepresentative;
    }

    public String getLegalRepresentative(){
    return this.legalRepresentative;
    }

    public void setFunds(String funds){
    this.funds = funds;
    }

    public String getFunds(){
    return this.funds;
    }

    public void setStartTime(Date startTime){
    this.startTime = startTime;
    }

    public Date getStartTime(){
    return this.startTime;
    }

    public void setEndTime(Date endTime){
    this.endTime = endTime;
    }

    public Date getEndTime(){
    return this.endTime;
    }

    public void setLongEffective(Boolean longEffective){
    this.longEffective = longEffective;
    }

    public Boolean getLongEffective(){
    return this.longEffective;
    }

    public void setEstablishmentDate(Date establishmentDate){
    this.establishmentDate = establishmentDate;
    }

    public Date getEstablishmentDate(){
    return this.establishmentDate;
    }

    public void setResidence(String residence){
    this.residence = residence;
    }

    public String getResidence(){
    return this.residence;
    }

    public void setBusinessScope(String businessScope){
    this.businessScope = businessScope;
    }

    public String getBusinessScope(){
    return this.businessScope;
    }

    public void setLicenseRemark(String licenseRemark){
    this.licenseRemark = licenseRemark;
    }

    public String getLicenseRemark(){
    return this.licenseRemark;
    }

    public void setBusinessLicenseUrl(String businessLicenseUrl){
    this.businessLicenseUrl = businessLicenseUrl;
    }

    public String getBusinessLicenseUrl(){
    return this.businessLicenseUrl;
    }

    public void setLegalIdCardUrl(String legalIdCardUrl){
    this.legalIdCardUrl = legalIdCardUrl;
    }

    public String getLegalIdCardUrl(){
    return this.legalIdCardUrl;
    }

    public void setLegalIdCardUrlNegative(String legalIdCardUrlNegative){
    this.legalIdCardUrlNegative = legalIdCardUrlNegative;
    }

    public String getLegalIdCardUrlNegative(){
    return this.legalIdCardUrlNegative;
    }

    public void setBusinessCode(String businessCode){
    this.businessCode = businessCode;
    }

    public String getBusinessCode(){
    return this.businessCode;
    }

    public void setBusinessName(String businessName){
    this.businessName = businessName;
    }

    public String getBusinessName(){
    return this.businessName;
    }

    public void setEffectiveDate(Date effectiveDate){
    this.effectiveDate = effectiveDate;
    }

    public Date getEffectiveDate(){
    return this.effectiveDate;
    }

    public void setDeadline(Date deadline){
    this.deadline = deadline;
    }

    public Date getDeadline(){
    return this.deadline;
    }

    public void setBusinessLongEffective(Boolean businessLongEffective){
    this.businessLongEffective = businessLongEffective;
    }

    public Boolean getBusinessLongEffective(){
    return this.businessLongEffective;
    }

    public void setBusinessMethod(String businessMethod){
    this.businessMethod = businessMethod;
    }

    public String getBusinessMethod(){
    return this.businessMethod;
    }

    public void setLegal(String legal){
    this.legal = legal;
    }

    public String getLegal(){
    return this.legal;
    }

    public void setPrincipal(String principal){
    this.principal = principal;
    }

    public String getPrincipal(){
    return this.principal;
    }

    public void setBusinessResidence(String businessResidence){
    this.businessResidence = businessResidence;
    }

    public String getBusinessResidence(){
    return this.businessResidence;
    }

    public void setBusinessPlace(String businessPlace){
    this.businessPlace = businessPlace;
    }

    public String getBusinessPlace(){
    return this.businessPlace;
    }

    public void setBusinessRange(String businessRange){
    this.businessRange = businessRange;
    }

    public String getBusinessRange(){
    return this.businessRange;
    }

    public void setStoreAddress(String storeAddress){
    this.storeAddress = storeAddress;
    }

    public String getStoreAddress(){
    return this.storeAddress;
    }

    public void setAnnexUrl(String annexUrl){
    this.annexUrl = annexUrl;
    }

    public String getAnnexUrl(){
    return this.annexUrl;
    }

    public void setRole(Boolean role){
    this.role = role;
    }

    public Boolean getRole(){
    return this.role;
    }

    public void setId(String id){
    this.id = id;
    }

    public String getId(){
    return this.id;
    }

    public void setNumber(String number){
    this.number = number;
    }

    public String getNumber(){
    return this.number;
    }


}

