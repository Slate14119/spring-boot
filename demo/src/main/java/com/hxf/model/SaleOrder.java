package com.hxf.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sale_order")
public class SaleOrder implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5978998687236897134L;

	@Id
	@GeneratedValue
    private Long id;

    private String code;

    private String traceSourceCode;

    private Integer status;

    private String cancelStatus;

    private String exceptionCode;

    private String exceptionRemark;

    private String waybillNoUrl;

    private Byte subStatus;

    private String subscriptionCode;

    private String waybillSourceType;

    private String statusRemark;

    private Long warehouseId;

    private Long provinceId;

    private Long cityId;

    private Long districtId;

    private String declareOrderCode;

    private String platformOrderCode;

    private Date orderCreateTime;

    private String buyerRegNo;

    private String buyerIdType;

    private String buyerIdNumber;

    private String buyerName;

    private String buyerTelephone;

    private String consigneeNo;

    private String consignee;

    private String consigneeTelephone;

    private String consigneeAddress;

    private String country;

    private String province;

    private String city;

    private String district;

    private String postCode;

    private BigDecimal productAmount;

    private BigDecimal freight;

    private BigDecimal discount;

    private BigDecimal taxTotal;

    private String taxCurrency;

    private BigDecimal acturalPaidAmount;

    private BigDecimal insuredFee;

    private String freightCurrency;

    private String platformCode;

    private String platformName;

    private String merchantCode;

    private String merchantName;

    private String shopCode;

    private String shopName;

    private String logisticsCompanyCode;

    private String logisticsCompanyName;

    private String logisticsNo;

    private String logisticsNote;

    private String payCode;

    private String payName;

    private String payTransactionId;

    private Date payTime;

    private String payNote;

    private String customsCode;

    private String ciqbCode;

    private String ieFlag;

    private String businessMode;

    private String orderType;

    private String transportMode;

    private String transportNo;

    private String voyageNo;

    private String billNo;

    private String shipperCode;

    private String wrapType;

    private Integer packageQuantity;

    private BigDecimal grossWeight;

    private BigDecimal netWeight;

    private String fromEplat;

    private String printHeader;

    private Long createdBy;

    private Date createTime;

    private Date updateTime;

    private Long updatedBy;

    private Byte isDeleted;

    private Long tenantId;

    private BigDecimal vat;

    private BigDecimal duty;

    private BigDecimal tariff;

    private BigDecimal consolidatedTax;

    private String authorizedCompanyCode;

    private String remark;

    private Byte isCreateDo;

    private Byte isAutoAudit;

    private Byte isTraceSource;

    private Byte platformAuditStatus;

    private String outerOrderCode;

    private String buyerNick;

    private Byte isDeductTax;

    private Long exceptionProcessLogId;

    private Date exceptionTime;

    private Byte isMultipleMerchant;

    private BigDecimal packageEstimateWeight;

    private BigDecimal packageActualWeight;

    private Date deliveryDate;

    private Byte needLogisticsType;

    private Integer expressType;

    private Integer auditCount;

    private Date auditNextInvokeTime;

    private String stationName;

    private String lpOrderCode;

    private Integer version;

    private Byte isStoreStrategy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getTraceSourceCode() {
        return traceSourceCode;
    }

    public void setTraceSourceCode(String traceSourceCode) {
        this.traceSourceCode = traceSourceCode == null ? null : traceSourceCode.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCancelStatus() {
        return cancelStatus;
    }

    public void setCancelStatus(String cancelStatus) {
        this.cancelStatus = cancelStatus == null ? null : cancelStatus.trim();
    }

    public String getExceptionCode() {
        return exceptionCode;
    }

    public void setExceptionCode(String exceptionCode) {
        this.exceptionCode = exceptionCode == null ? null : exceptionCode.trim();
    }

    public String getExceptionRemark() {
        return exceptionRemark;
    }

    public void setExceptionRemark(String exceptionRemark) {
        this.exceptionRemark = exceptionRemark == null ? null : exceptionRemark.trim();
    }

    public String getWaybillNoUrl() {
        return waybillNoUrl;
    }

    public void setWaybillNoUrl(String waybillNoUrl) {
        this.waybillNoUrl = waybillNoUrl == null ? null : waybillNoUrl.trim();
    }

    public Byte getSubStatus() {
        return subStatus;
    }

    public void setSubStatus(Byte subStatus) {
        this.subStatus = subStatus;
    }

    public String getSubscriptionCode() {
        return subscriptionCode;
    }

    public void setSubscriptionCode(String subscriptionCode) {
        this.subscriptionCode = subscriptionCode == null ? null : subscriptionCode.trim();
    }

    public String getWaybillSourceType() {
        return waybillSourceType;
    }

    public void setWaybillSourceType(String waybillSourceType) {
        this.waybillSourceType = waybillSourceType == null ? null : waybillSourceType.trim();
    }

    public String getStatusRemark() {
        return statusRemark;
    }

    public void setStatusRemark(String statusRemark) {
        this.statusRemark = statusRemark == null ? null : statusRemark.trim();
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    public String getDeclareOrderCode() {
        return declareOrderCode;
    }

    public void setDeclareOrderCode(String declareOrderCode) {
        this.declareOrderCode = declareOrderCode == null ? null : declareOrderCode.trim();
    }

    public String getPlatformOrderCode() {
        return platformOrderCode;
    }

    public void setPlatformOrderCode(String platformOrderCode) {
        this.platformOrderCode = platformOrderCode == null ? null : platformOrderCode.trim();
    }

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public String getBuyerRegNo() {
        return buyerRegNo;
    }

    public void setBuyerRegNo(String buyerRegNo) {
        this.buyerRegNo = buyerRegNo == null ? null : buyerRegNo.trim();
    }

    public String getBuyerIdType() {
        return buyerIdType;
    }

    public void setBuyerIdType(String buyerIdType) {
        this.buyerIdType = buyerIdType == null ? null : buyerIdType.trim();
    }

    public String getBuyerIdNumber() {
        return buyerIdNumber;
    }

    public void setBuyerIdNumber(String buyerIdNumber) {
        this.buyerIdNumber = buyerIdNumber == null ? null : buyerIdNumber.trim();
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName == null ? null : buyerName.trim();
    }

    public String getBuyerTelephone() {
        return buyerTelephone;
    }

    public void setBuyerTelephone(String buyerTelephone) {
        this.buyerTelephone = buyerTelephone == null ? null : buyerTelephone.trim();
    }

    public String getConsigneeNo() {
        return consigneeNo;
    }

    public void setConsigneeNo(String consigneeNo) {
        this.consigneeNo = consigneeNo == null ? null : consigneeNo.trim();
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getConsigneeTelephone() {
        return consigneeTelephone;
    }

    public void setConsigneeTelephone(String consigneeTelephone) {
        this.consigneeTelephone = consigneeTelephone == null ? null : consigneeTelephone.trim();
    }

    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress == null ? null : consigneeAddress.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public BigDecimal getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(BigDecimal productAmount) {
        this.productAmount = productAmount;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getTaxTotal() {
        return taxTotal;
    }

    public void setTaxTotal(BigDecimal taxTotal) {
        this.taxTotal = taxTotal;
    }

    public String getTaxCurrency() {
        return taxCurrency;
    }

    public void setTaxCurrency(String taxCurrency) {
        this.taxCurrency = taxCurrency == null ? null : taxCurrency.trim();
    }

    public BigDecimal getActuralPaidAmount() {
        return acturalPaidAmount;
    }

    public void setActuralPaidAmount(BigDecimal acturalPaidAmount) {
        this.acturalPaidAmount = acturalPaidAmount;
    }

    public BigDecimal getInsuredFee() {
        return insuredFee;
    }

    public void setInsuredFee(BigDecimal insuredFee) {
        this.insuredFee = insuredFee;
    }

    public String getFreightCurrency() {
        return freightCurrency;
    }

    public void setFreightCurrency(String freightCurrency) {
        this.freightCurrency = freightCurrency == null ? null : freightCurrency.trim();
    }

    public String getPlatformCode() {
        return platformCode;
    }

    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode == null ? null : platformCode.trim();
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName == null ? null : platformName.trim();
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode == null ? null : merchantCode.trim();
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode == null ? null : shopCode.trim();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getLogisticsCompanyCode() {
        return logisticsCompanyCode;
    }

    public void setLogisticsCompanyCode(String logisticsCompanyCode) {
        this.logisticsCompanyCode = logisticsCompanyCode == null ? null : logisticsCompanyCode.trim();
    }

    public String getLogisticsCompanyName() {
        return logisticsCompanyName;
    }

    public void setLogisticsCompanyName(String logisticsCompanyName) {
        this.logisticsCompanyName = logisticsCompanyName == null ? null : logisticsCompanyName.trim();
    }

    public String getLogisticsNo() {
        return logisticsNo;
    }

    public void setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo == null ? null : logisticsNo.trim();
    }

    public String getLogisticsNote() {
        return logisticsNote;
    }

    public void setLogisticsNote(String logisticsNote) {
        this.logisticsNote = logisticsNote == null ? null : logisticsNote.trim();
    }

    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode == null ? null : payCode.trim();
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName == null ? null : payName.trim();
    }

    public String getPayTransactionId() {
        return payTransactionId;
    }

    public void setPayTransactionId(String payTransactionId) {
        this.payTransactionId = payTransactionId == null ? null : payTransactionId.trim();
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getPayNote() {
        return payNote;
    }

    public void setPayNote(String payNote) {
        this.payNote = payNote == null ? null : payNote.trim();
    }

    public String getCustomsCode() {
        return customsCode;
    }

    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode == null ? null : customsCode.trim();
    }

    public String getCiqbCode() {
        return ciqbCode;
    }

    public void setCiqbCode(String ciqbCode) {
        this.ciqbCode = ciqbCode == null ? null : ciqbCode.trim();
    }

    public String getIeFlag() {
        return ieFlag;
    }

    public void setIeFlag(String ieFlag) {
        this.ieFlag = ieFlag == null ? null : ieFlag.trim();
    }

    public String getBusinessMode() {
        return businessMode;
    }

    public void setBusinessMode(String businessMode) {
        this.businessMode = businessMode == null ? null : businessMode.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode == null ? null : transportMode.trim();
    }

    public String getTransportNo() {
        return transportNo;
    }

    public void setTransportNo(String transportNo) {
        this.transportNo = transportNo == null ? null : transportNo.trim();
    }

    public String getVoyageNo() {
        return voyageNo;
    }

    public void setVoyageNo(String voyageNo) {
        this.voyageNo = voyageNo == null ? null : voyageNo.trim();
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    public String getShipperCode() {
        return shipperCode;
    }

    public void setShipperCode(String shipperCode) {
        this.shipperCode = shipperCode == null ? null : shipperCode.trim();
    }

    public String getWrapType() {
        return wrapType;
    }

    public void setWrapType(String wrapType) {
        this.wrapType = wrapType == null ? null : wrapType.trim();
    }

    public Integer getPackageQuantity() {
        return packageQuantity;
    }

    public void setPackageQuantity(Integer packageQuantity) {
        this.packageQuantity = packageQuantity;
    }

    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    public BigDecimal getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(BigDecimal netWeight) {
        this.netWeight = netWeight;
    }

    public String getFromEplat() {
        return fromEplat;
    }

    public void setFromEplat(String fromEplat) {
        this.fromEplat = fromEplat == null ? null : fromEplat.trim();
    }

    public String getPrintHeader() {
        return printHeader;
    }

    public void setPrintHeader(String printHeader) {
        this.printHeader = printHeader == null ? null : printHeader.trim();
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public BigDecimal getDuty() {
        return duty;
    }

    public void setDuty(BigDecimal duty) {
        this.duty = duty;
    }

    public BigDecimal getTariff() {
        return tariff;
    }

    public void setTariff(BigDecimal tariff) {
        this.tariff = tariff;
    }

    public BigDecimal getConsolidatedTax() {
        return consolidatedTax;
    }

    public void setConsolidatedTax(BigDecimal consolidatedTax) {
        this.consolidatedTax = consolidatedTax;
    }

    public String getAuthorizedCompanyCode() {
        return authorizedCompanyCode;
    }

    public void setAuthorizedCompanyCode(String authorizedCompanyCode) {
        this.authorizedCompanyCode = authorizedCompanyCode == null ? null : authorizedCompanyCode.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Byte getIsCreateDo() {
        return isCreateDo;
    }

    public void setIsCreateDo(Byte isCreateDo) {
        this.isCreateDo = isCreateDo;
    }

    public Byte getIsAutoAudit() {
        return isAutoAudit;
    }

    public void setIsAutoAudit(Byte isAutoAudit) {
        this.isAutoAudit = isAutoAudit;
    }

    public Byte getIsTraceSource() {
        return isTraceSource;
    }

    public void setIsTraceSource(Byte isTraceSource) {
        this.isTraceSource = isTraceSource;
    }

    public Byte getPlatformAuditStatus() {
        return platformAuditStatus;
    }

    public void setPlatformAuditStatus(Byte platformAuditStatus) {
        this.platformAuditStatus = platformAuditStatus;
    }

    public String getOuterOrderCode() {
        return outerOrderCode;
    }

    public void setOuterOrderCode(String outerOrderCode) {
        this.outerOrderCode = outerOrderCode == null ? null : outerOrderCode.trim();
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick == null ? null : buyerNick.trim();
    }

    public Byte getIsDeductTax() {
        return isDeductTax;
    }

    public void setIsDeductTax(Byte isDeductTax) {
        this.isDeductTax = isDeductTax;
    }

    public Long getExceptionProcessLogId() {
        return exceptionProcessLogId;
    }

    public void setExceptionProcessLogId(Long exceptionProcessLogId) {
        this.exceptionProcessLogId = exceptionProcessLogId;
    }

    public Date getExceptionTime() {
        return exceptionTime;
    }

    public void setExceptionTime(Date exceptionTime) {
        this.exceptionTime = exceptionTime;
    }

    public Byte getIsMultipleMerchant() {
        return isMultipleMerchant;
    }

    public void setIsMultipleMerchant(Byte isMultipleMerchant) {
        this.isMultipleMerchant = isMultipleMerchant;
    }

    public BigDecimal getPackageEstimateWeight() {
        return packageEstimateWeight;
    }

    public void setPackageEstimateWeight(BigDecimal packageEstimateWeight) {
        this.packageEstimateWeight = packageEstimateWeight;
    }

    public BigDecimal getPackageActualWeight() {
        return packageActualWeight;
    }

    public void setPackageActualWeight(BigDecimal packageActualWeight) {
        this.packageActualWeight = packageActualWeight;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Byte getNeedLogisticsType() {
        return needLogisticsType;
    }

    public void setNeedLogisticsType(Byte needLogisticsType) {
        this.needLogisticsType = needLogisticsType;
    }

    public Integer getExpressType() {
        return expressType;
    }

    public void setExpressType(Integer expressType) {
        this.expressType = expressType;
    }

    public Integer getAuditCount() {
        return auditCount;
    }

    public void setAuditCount(Integer auditCount) {
        this.auditCount = auditCount;
    }

    public Date getAuditNextInvokeTime() {
        return auditNextInvokeTime;
    }

    public void setAuditNextInvokeTime(Date auditNextInvokeTime) {
        this.auditNextInvokeTime = auditNextInvokeTime;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName == null ? null : stationName.trim();
    }

    public String getLpOrderCode() {
        return lpOrderCode;
    }

    public void setLpOrderCode(String lpOrderCode) {
        this.lpOrderCode = lpOrderCode == null ? null : lpOrderCode.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Byte getIsStoreStrategy() {
        return isStoreStrategy;
    }

    public void setIsStoreStrategy(Byte isStoreStrategy) {
        this.isStoreStrategy = isStoreStrategy;
    }
}