package com.cindy.mapper;

import java.util.List;

import com.cindy.bean.TbItemCat;

public interface TbItemCatMapper {

	List<TbItemCat> findTbItemCatById(Long parentId);
	
}
