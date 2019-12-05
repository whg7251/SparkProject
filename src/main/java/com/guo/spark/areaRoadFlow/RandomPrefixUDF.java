package com.guo.spark.areaRoadFlow;

import java.util.Random;

import org.apache.spark.sql.api.java.UDF2;

public class RandomPrefixUDF implements UDF2<String, Integer, String>{

	/**
	 * 0_海淀区：建材城西路
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String call(String area_name_road_id, Integer ranNum) throws Exception {
		Random random = new Random();
		int prefix = random.nextInt(ranNum);
		return prefix+"_"+area_name_road_id;
	}

}
