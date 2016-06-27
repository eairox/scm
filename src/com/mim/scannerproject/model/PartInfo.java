package com.mim.scannerproject.model;

import java.io.Serializable;

public class PartInfo implements Serializable {
	
	private String sscc;
	private String PartNum;
	private Integer PartQty;
	private String FromWarehouse;
	private String FromBin;
	private String ToWarehouse;
	private String ToBin;
	private String referencePrefix;
	
	public PartInfo(){
		super();
	}
	
	public PartInfo(String sscc, String partNum, Integer partQty, String fromWarehouse, String fromBin,
			String toWarehouse, String toBin, String referencePrefix) {
		super();
		this.sscc = sscc;
		PartNum = partNum;
		PartQty = partQty;
		FromWarehouse = fromWarehouse;
		FromBin = fromBin;
		ToWarehouse = toWarehouse;
		ToBin = toBin;
		this.referencePrefix = referencePrefix;
	}
	public String getSscc() {
		return sscc;
	}
	public void setSscc(String sscc) {
		this.sscc = sscc;
	}
	public String getPartNum() {
		return PartNum;
	}
	public void setPartNum(String partNum) {
		PartNum = partNum;
	}
	public Integer getPartQty() {
		return PartQty;
	}
	public void setPartQty(Integer partQty) {
		PartQty = partQty;
	}
	public String getFromWarehouse() {
		return FromWarehouse;
	}
	public void setFromWarehouse(String fromWarehouse) {
		FromWarehouse = fromWarehouse;
	}
	public String getFromBin() {
		return FromBin;
	}
	public void setFromBin(String fromBin) {
		FromBin = fromBin;
	}
	public String getToWarehouse() {
		return ToWarehouse;
	}
	public void setToWarehouse(String toWarehouse) {
		ToWarehouse = toWarehouse;
	}
	public String getToBin() {
		return ToBin;
	}
	public void setToBin(String toBin) {
		ToBin = toBin;
	}
	public String getReferencePrefix() {
		return referencePrefix;
	}
	public void setReferencePrefix(String referencePrefix) {
		this.referencePrefix = referencePrefix;
	}
	
	
}
