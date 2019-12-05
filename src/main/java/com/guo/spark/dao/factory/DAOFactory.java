package com.guo.spark.dao.factory;

import com.guo.spark.dao.IAreaDao;
import com.guo.spark.dao.ICarTrackDAO;
import com.guo.spark.dao.IMonitorDAO;
import com.guo.spark.dao.IRandomExtractDAO;
import com.guo.spark.dao.ITaskDAO;
import com.guo.spark.dao.IWithTheCarDAO;
import com.guo.spark.dao.impl.AreaDaoImpl;
import com.guo.spark.dao.impl.CarTrackDAOImpl;
import com.guo.spark.dao.impl.MonitorDAOImpl;
import com.guo.spark.dao.impl.RandomExtractDAOImpl;
import com.guo.spark.dao.impl.TaskDAOImpl;
import com.guo.spark.dao.impl.WithTheCarDAOImpl;

/**
 * DAO工厂类
 * @author root
 *
 */
public class DAOFactory {
	
	
	public static ITaskDAO getTaskDAO(){
		return new TaskDAOImpl();
	}
	
	public static IMonitorDAO getMonitorDAO(){
		return new MonitorDAOImpl();
	}
	
	public static IRandomExtractDAO getRandomExtractDAO(){
		return new RandomExtractDAOImpl();
	}
	
	public static ICarTrackDAO getCarTrackDAO(){
		return new CarTrackDAOImpl();
	}
	
	public static IWithTheCarDAO getWithTheCarDAO(){
		return new WithTheCarDAOImpl();
	}

	public static IAreaDao getAreaDao() {
		return  new AreaDaoImpl();
		
	}
}
