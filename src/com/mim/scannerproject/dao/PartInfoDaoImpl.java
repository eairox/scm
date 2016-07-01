package com.mim.scannerproject.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mim.scannerproject.model.EpiUserInfo;
import com.mim.scannerproject.model.PartInfo;

@Component
public class PartInfoDaoImpl implements PartInfoDao {

	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	private String prodSite = "2";
	private EpiUserInfo epiUserInfo;
	//String sql = "Select * from mim.VTransInboundtoPutway where PartTran_UD_PTRN_SSCC_c = " + "208156790200148319";
	
	@Override
	public PartInfo getPartInfo(String sscc) throws SQLException
	{	
		String sql = "Select * from mim.VTransInboundtoPutway where PartTran_UD_PTRN_SSCC_c = " + sscc;
		PartInfo info = new PartInfo();
		conn = ConnectionManager.getConnection();
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			info.setFromBin(rs.getString("FromBin"));
			info.setFromWarehouse(rs.getString("FromWarehouseCode"));
			info.setToBin(rs.getString("ToBin"));
			info.setToWarehouse(rs.getString("ToWarehousecode"));
			info.setPartNum(rs.getString("PartTran_PartNum"));
			info.setPartQty(Integer.parseInt(rs.getString("PartTran_TranQty")));
		}
		
		rs.close();
		stmt.close();
		ConnectionManager.closeConnection(conn);
		return info;
		
	}

	@Override
	public EpiUserInfo getEpiUser(String prodSite) throws SQLException {
		String sql = "select prod_site_desc,epi_location,epiUser from dbo.prod_site where prod_site_id ='" + prodSite + "'";
		EpiUserInfo epiUserInfo = new EpiUserInfo();
		conn = ConnectionManager.getConnectionEpiUser();
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			epiUserInfo.setEpiLocation(rs.getString("prod_site_desc"));
			epiUserInfo.setSiteDesc(rs.getString("prod_site_desc"));
			epiUserInfo.setEpiUser(rs.getString("epiUser"));
		}
		rs.close();
		stmt.close();
		ConnectionManager.closeConnection(conn);
		return epiUserInfo;
	}

	@Override
	public PartInfo createAndProcessMaterialQueue(String SSCC, String PartNum, String PartQty, String FromWarehouse,
			String FromBin, String ToWarehouse, String ToBin, Boolean invPutAway, String TransferType,
			String ReferencePrefix)  {
		// TODO Auto-generated method stub
		try {
			epiUserInfo = getEpiUser("2");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
