package com.cindy.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cindy.bean.TbItemCat;
import com.cindy.common.ZTreeNodeResult;
import com.cindy.mapper.TbItemCatMapper;
import com.cindy.service.TbItemCatService;
@Service
public class TbItemCatServiceImpl implements TbItemCatService {
	@Autowired
	private TbItemCatMapper tbItemCatMapper;
	@Override
	public List<ZTreeNodeResult> findTbItemCatById(Long parentId) {
		List<TbItemCat> tbItemCats = tbItemCatMapper.findTbItemCatById(parentId);
		//根据分类id搜索，返回分类集合
		List<ZTreeNodeResult> result = new ArrayList<ZTreeNodeResult>();
		for (TbItemCat tbItemCat : tbItemCats) {
			ZTreeNodeResult node = new ZTreeNodeResult();
			node.setId(tbItemCat.getId());
			node.setName(tbItemCat.getName());
			node.setIsParent(tbItemCat.getIsParent());
			result.add(node);//把返回的分类集合装进ztree对象
		}
		return result;//返回成Ztree节点集合
	}

}
