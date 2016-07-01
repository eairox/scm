package com.mim.scannerproject.service;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mim.scannerproject.dao.PartInfoDao;
import com.mim.scannerproject.dao.PartInfoDaoImpl;
import com.mim.scannerproject.model.EpiUserInfo;
import com.mim.scannerproject.model.PartInfo;

@Path("/partInfo")
@Service
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PartInfoService {
	
	final static Logger logger = LoggerFactory.getLogger(PartInfoService.class);


		private PartInfoDao partInfoDao;
		
		private void setDao()
		{
			this.partInfoDao = new PartInfoDaoImpl();
		}
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public PartInfo getPartInfo(@QueryParam("sscc") String sscc) throws SQLException    
		{
			logger.info("Called getPartInfo for " + sscc);
			//this.partInfoDao = new PartInfoDaoImpl();
			setDao();
			return partInfoDao.getPartInfo(sscc);
			
		}
		
		/*@GET
		@Path("/epiUser")
		@Produces(MediaType.APPLICATION_JSON)
		public EpiUserInfo getEpiUser(@QueryParam("siteId") String siteId) throws SQLException    
		{
			logger.info("Called getPartInfo for " + siteId);
			this.partInfoDao = new PartInfoDaoImpl();
			return partInfoDao.getEpiUser(siteId);
			
		}*/
		
		@GET
		@Path("/inboundToPutwayTransfer")
		@Produces(MediaType.APPLICATION_JSON)
		public PartInfo createAndProcessMaterialQueue(@QueryParam("sscc") String sscc, @QueryParam("partNum") String partNum, @QueryParam("partQty") String partQty,
				@QueryParam("fromWarehouse") String fromWarehouse, @QueryParam("toWarehouse") String toWarehouse,
				@QueryParam("fromBin") String fromBin, @QueryParam("toBin") String toBin,
				@QueryParam("invPutAway") Boolean invPutAway,@QueryParam("referencePrefix") String referencePrefix) 
		{
			logger.info("Called getPartInfo for " + referencePrefix,sscc);
			setDao();
			//return partInfoDao.createAndProcessMaterialQueue(SSCC, PartNum, PartQty, FromWarehouse, FromBin, ToWarehouse, ToBin, invPutAway, TransferType, ReferencePrefix);
			return null;
		}
		

}