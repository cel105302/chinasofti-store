package com.chinasofti.mall.web.entrance.hystrix;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.chinasofti.mall.common.entity.SpGoodsClass;
import com.chinasofti.mall.web.entrance.feign.SpGoodsClassFeignClient;

import net.sf.json.JSONObject;

@Component
public class SpGoodsClassFeignClientHystrix implements SpGoodsClassFeignClient{

	@Override
	public String selectByGoodsClass(SpGoodsClass spGoodsClass) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("total", 0);
		jsonObject.put("rows", new ArrayList<>());
		return jsonObject.toString();
	}

	@Override
	public int deleteGoodsClassById(String ids) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SpGoodsClass selectGoodsClassById(String ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateGoodsClass(SpGoodsClass spGoodsClass) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveGoodsClass(SpGoodsClass spGoodsClass) {
		// TODO Auto-generated method stub
		return 0;
	}

}