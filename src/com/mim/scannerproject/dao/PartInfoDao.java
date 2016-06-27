package com.mim.scannerproject.dao;

import java.sql.SQLException;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mim.scannerproject.model.PartInfo;

public interface PartInfoDao {
	public PartInfo getPartInfo() throws SQLException;
}
