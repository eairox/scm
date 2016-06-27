package com.mim.scannerproject.service;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.springframework.stereotype.Service;

import com.mim.scannerproject.dao.PartInfoDao;
import com.mim.scannerproject.dao.PartInfoDaoImpl;
import com.mim.scannerproject.model.PartInfo;

@Path("/partInfo")
@Service
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PartInfoService {

		private PartInfoDao partInfoDao;
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public PartInfo getPartInfo(@QueryParam("sscc") String sscc) throws SQLException    
		{
			this.partInfoDao = new PartInfoDaoImpl();
			return partInfoDao.getPartInfo(sscc);
			
		}

}