package com.ibase.mall.modules.goods.entity;

import java.math.BigDecimal;

import com.thinkgem.jeesite.common.persistence.DataEntity;

public class GoodsInfo extends DataEntity<GoodsInfo>{

	private static final long serialVersionUID = 7720023756084746523L;
	private String goodsName;
	private BigDecimal goodsPrice;
	
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public BigDecimal getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(BigDecimal goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	
	

}
