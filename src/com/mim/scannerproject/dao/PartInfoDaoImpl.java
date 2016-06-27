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

import com.mim.scannerproject.model.PartInfo;

@Component
public class PartInfoDaoImpl implements PartInfoDao {

	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;
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
		
		/*info.setFromBin("INBNDMT");
		info.setFromWarehouse("FBINBND");
		info.setToBin("PUTAWAY");
		info.setToWarehouse("FBPUTWAY");
		info.setPartNum("86007600");
		info.setPartQty(7);*/
		
		return info;
	}
	
}
