package com.wzy.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wzy.dao.RegionDAO;
import com.wzy.model.RegionModel;
import com.wzy.service.RegionService;


@Service("RegionService")  
public class RegionServiceImpl implements RegionService {
	
	@Resource
	private RegionDAO RegionDAO;

	
	
	public RegionModel findById(int id) {

		return RegionDAO.findById(id);
	}

}
