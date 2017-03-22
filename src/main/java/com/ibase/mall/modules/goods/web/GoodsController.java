package com.ibase.mall.modules.goods.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ibase.mall.modules.goods.entity.GoodsInfo;
import com.ibase.mall.modules.goods.service.GoodsService;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.web.BaseController;


@Controller
@RequestMapping(value = "${adminPath}/goods/")
public class GoodsController extends BaseController{
	
	@Autowired
	private GoodsService goodsService;
	
	@RequestMapping(value = {"list", ""})
	public String list(GoodsInfo goodsInfo,HttpServletRequest request, HttpServletResponse response,Model model){
		System.out.println("list test");
		Page<GoodsInfo> page = goodsService.findPage(new Page<GoodsInfo>(request, response), goodsInfo);
        model.addAttribute("page", page);
		return "modules/goods/goodsList";
	}

}
