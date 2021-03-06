/**
 * 项目名称：com.finemanagement.entity.store
 * 创建日期：2016-4-6
 *创建文件    by zhangyong
 */
package com.finemanagement.entity.store;

import com.base.entity.BaseEntity;

/**
 * 
 * @author zhangyong
 */
public class SysStore extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7010592677086277152L;
	private Integer id; // id主键
	private String productNo; // 商品编号
	private String inputName; // 投入品名称
	private int classifyId; // 分类
	private String unit; // 单位符号
	private String specifications; // 规格
	private int brandId; // 品牌
	private int mfid; // 厂家
    private String purchaseCount;//数量
    private String unitPrice;//单价
    private String totalprice;//总价
    private int warehouseid ;//库房
    private String sysid ;//系统
    private String technicalstaff ;//技术人员
    private String principal ;//负责人
    private String remark ;//说明
    private String instoretime;//入库时间
    private String outstoretime;//出库时间
    private String outuser;//使用人
    private int baseid;//基地
    private int greenhouseid;//大棚
    private String outpurchaseCount;//出库数量
    private String syssign;//
    private String baseName;
    private String greenhouseName;
	private String classname;
	private String brandName;
	private String mfName;
	private String whName;
	private String outremark ;//出库说明
	private String processInstanceId; // 零时使用
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getProductNo() {
		return productNo;
	}


	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}


	public String getInputName() {
		return inputName;
	}


	public void setInputName(String inputName) {
		this.inputName = inputName;
	}


	public int getClassifyId() {
		return classifyId;
	}


	public void setClassifyId(int classifyId) {
		this.classifyId = classifyId;
	}


	public String getUnit() {
		return unit;
	}


	public void setUnit(String unit) {
		this.unit = unit;
	}


	public String getSpecifications() {
		return specifications;
	}


	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}


	public int getBrandId() {
		return brandId;
	}


	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}


	public int getMfid() {
		return mfid;
	}


	public void setMfid(int mfid) {
		this.mfid = mfid;
	}


	public String getPurchaseCount() {
		return purchaseCount;
	}


	public void setPurchaseCount(String purchaseCount) {
		this.purchaseCount = purchaseCount;
	}


	public String getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}


	public String getTotalprice() {
		return totalprice;
	}


	public void setTotalprice(String totalprice) {
		this.totalprice = totalprice;
	}


	public int getWarehouseid() {
		return warehouseid;
	}


	public void setWarehouseid(int warehouseid) {
		this.warehouseid = warehouseid;
	}


	public String getSysid() {
		return sysid;
	}


	public void setSysid(String sysid) {
		this.sysid = sysid;
	}


	public String getClassname() {
		return classname;
	}


	public void setClassname(String classname) {
		this.classname = classname;
	}


	public String getBrandName() {
		return brandName;
	}


	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}


	public String getMfName() {
		return mfName;
	}


	public void setMfName(String mfName) {
		this.mfName = mfName;
	}


	public String getWhName() {
		return whName;
	}


	public void setWhName(String whName) {
		this.whName = whName;
	}


	public String getTechnicalstaff() {
		return technicalstaff;
	}


	public void setTechnicalstaff(String technicalstaff) {
		this.technicalstaff = technicalstaff;
	}


	public String getPrincipal() {
		return principal;
	}


	public void setPrincipal(String principal) {
		this.principal = principal;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


	public String getInstoretime() {
		return instoretime;
	}


	public void setInstoretime(String instoretime) {
		this.instoretime = instoretime;
	}


	public String getOutstoretime() {
		return outstoretime;
	}


	public void setOutstoretime(String outstoretime) {
		this.outstoretime = outstoretime;
	}


	public String getOutuser() {
		return outuser;
	}


	public void setOutuser(String outuser) {
		this.outuser = outuser;
	}


	public int getBaseid() {
		return baseid;
	}


	public void setBaseid(int baseid) {
		this.baseid = baseid;
	}


	public int getGreenhouseid() {
		return greenhouseid;
	}


	public void setGreenhouseid(int greenhouseid) {
		this.greenhouseid = greenhouseid;
	}


	public String getOutpurchaseCount() {
		return outpurchaseCount;
	}


	public void setOutpurchaseCount(String outpurchaseCount) {
		this.outpurchaseCount = outpurchaseCount;
	}


	public String getBaseName() {
		return baseName;
	}


	public void setBaseName(String baseName) {
		this.baseName = baseName;
	}

	/**
	 * @return the greenhouseName
	 */
	public String getGreenhouseName() {
		return greenhouseName;
	}


	/**
	 * @param greenhouseName the greenhouseName to set
	 */
	public void setGreenhouseName(String greenhouseName) {
		this.greenhouseName = greenhouseName;
	}


	public String getOutremark() {
		return outremark;
	}


	public void setOutremark(String outremark) {
		this.outremark = outremark;
	}


	public String getSyssign() {
		return syssign;
	}


	public void setSyssign(String syssign) {
		this.syssign = syssign;
	}


	public String getProcessInstanceId() {
		return processInstanceId;
	}


	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	
	
}
