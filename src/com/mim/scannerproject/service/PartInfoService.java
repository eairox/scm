package com.mim.scannerproject.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam; 
import org.springframework.beans.factory.annotation.Autowired;

import com.mim.scannerproject.model.PartInfo;

@Path("/partInfo")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PartInfoService {
	
	@Autowired
    private PartInfoDao partInfoDao;

	@GET
	//@Path("/{sscc}")
	@Produces(MediaType.APPLICATION_JSON)
	public PartInfo getPartInfo()
	{
		PartInfo info = new PartInfo();
		info.setFromBin("INBNDMT");
		info.setFromWarehouse("FBINBND");
		info.setToBin("PUTAWAY");
		info.setToWarehouse("FBPUTWAY");
		info.setPartNum("86007600");
		info.setPartQty(7);
		return info;
	}
}

//http://localhost:8080/scmmobile/api/partInfo