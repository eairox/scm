package com.mim.scannerproject.dao;

import java.sql.SQLException;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mim.scannerproject.model.EpiUserInfo;
import com.mim.scannerproject.model.PartInfo;

public interface PartInfoDao {
	public PartInfo getPartInfo(String sscc) throws SQLException;
	public EpiUserInfo getEpiUser(String prodSite) throws SQLException;
	public PartInfo createAndProcessMaterialQueue(String SSCC, String PartNum, String PartQty, String FromWarehouse, String FromBin, String ToWarehouse, String ToBin, Boolean invPutAway, String TransferType, String ReferencePrefix) throws SQLException;
		
}
