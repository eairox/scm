package com.mim.scannerproject.model;

import java.io.Serializable;

public class EpiUserInfo implements Serializable {
	
	private Integer siteId;
	private String siteDesc;
	private String epiLocation;
	private String epiUser;
	
	public EpiUserInfo()
	{
		super();
	}
	
	public EpiUserInfo(Integer siteId,String siteDesc,String epiLocation,String epiUser)
	{
		super();
		this.siteId = siteId;
		this.siteDesc = siteDesc;
		this.epiLocation = epiLocation;
		this.epiUser = epiUser;
	}
	
	public Integer getSiteId() {
		return siteId;
	}
	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}
	public String getSiteDesc() {
		return siteDesc;
	}
	public void setSiteDesc(String siteDesc) {
		this.siteDesc = siteDesc;
	}
	public String getEpiLocation() {
		return epiLocation;
	}
	public void setEpiLocation(String epiLocation) {
		this.epiLocation = epiLocation;
	}
	public String getEpiUser() {
		return epiUser;
	}
	public void setEpiUser(String epiUser) {
		this.epiUser = epiUser;
	}
	
	
}
