package com.ibase.mall.modules.goods.dao;

import com.ibase.mall.modules.goods.entity.GoodsInfo;
import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;

@MyBatisDao
public interface GoodsDao extends CrudDao<GoodsInfo>{

}
