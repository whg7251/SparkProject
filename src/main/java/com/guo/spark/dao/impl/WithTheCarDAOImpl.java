package com.guo.spark.dao.impl;

import com.guo.spark.constant.Constants;
import com.guo.spark.dao.IWithTheCarDAO;
import com.guo.spark.jdbc.JDBCHelper;
import com.guo.spark.util.DateUtils;

public class WithTheCarDAOImpl implements IWithTheCarDAO {

	@Override
	public void updateTestData(String cars) {
		JDBCHelper jdbcHelper = JDBCHelper.getInstance();
		String sql = "UPDATE task set task_param = ? WHERE task_id = 3";
		Object[] params = new Object[]{"{\"startDate\":[\""+ DateUtils.getTodayDate()+"\"],\"endDate\":[\""+DateUtils.getTodayDate()+"\"],\""+Constants.FIELD_CARS+"\":[\""+cars+"\"]}"};
		jdbcHelper.executeUpdate(sql, params);
	}

}
