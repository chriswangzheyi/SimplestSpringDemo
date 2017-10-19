package com.wzy.dao;

import java.util.List;



import com.wzy.model.RegionModel;


public interface RegionDAO {
	
/*	void save(RegionModel user); void update(RegionModel RegionModel); 
	void delete(int id); */
	RegionModel findById(int id); 
/*	List<RegionModel> findAll();*/
	
}
