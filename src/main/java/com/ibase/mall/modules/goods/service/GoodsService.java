package com.ibase.mall.modules.goods.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibase.mall.modules.goods.dao.GoodsDao;
import com.ibase.mall.modules.goods.entity.GoodsInfo;
import com.thinkgem.jeesite.common.service.CrudService;


@Service
@Transactional(readOnly = true)
public class GoodsService extends CrudService<GoodsDao, GoodsInfo>{

}
