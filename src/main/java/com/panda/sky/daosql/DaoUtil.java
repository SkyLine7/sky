package com.panda.sky.daosql;

import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

/**
 * 执行sql语句工具类
 * @author pcongda
 */
@Component
public class DaoUtil<T> {
	private static final Logger logger = LoggerFactory.getLogger(DaoUtil.class);
	
	@PersistenceContext
	private EntityManager entityManager;
	
	/**
	 * 返回单个对象
	 * @author pcongda
	 * @param sql
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public T getOneResult(String sql, Class<?> clazz){
		T entity = null;
		try {
			Query queryData = entityManager.createNativeQuery(sql);
			queryData.unwrap(SQLQuery.class).setResultTransformer(Transformers.aliasToBean(clazz));
			entity = (T) queryData.getSingleResult();
    	} catch(Exception e) {
    		logger.info("执行返回sql语句出错--{}", e.getMessage());
    	} finally {
    		//关闭entityManager
    		if(entityManager != null) {
    			entityManager.close();
    		}
    	}
		return entity;
	}
	
	/**
	 * 返回集合
	 * @author Murphy.Chang
	 * @param sql
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<T> getResultList(String sql, Class<?> clazz){
		//获取记录
		List<T> list = new ArrayList<T>();
		try {
			Query queryData = entityManager.createNativeQuery(sql);
			queryData.unwrap(SQLQuery.class).setResultTransformer(Transformers.aliasToBean(clazz));
			list = queryData.getResultList();
    	} catch(Exception e) {
    		logger.info("执行返回集合sql语句出错--{}", e.getMessage());
    	} finally {
    		//关闭entityManager
    		if(entityManager != null) {
    			entityManager.close();
    		}
    	}
		return list;
	}
	
	/**
	 * 返回分页集合
	 * @author zhao rui
	 * @date 2018年4月18日
	 * @param sql  SQL语句
	 * @param page 页码
	 * @param size 每页条数
	 * @param clazz 类
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public Page<T> getPagerResultList(String sql, Integer page, Integer size, Class<?> clazz){
		logger.info("执行分页返回集合sql语句--页码:{} 每页条数:{}", page, size);
		//获取记录
		List<T> content = new ArrayList<T>();
		Object objTotalCount = null;
		//获取记录
		try {
			 //统计所有数据条数
		    String countSql = "select count(1) as cnt from (" + sql + ") temp ";
		    Query countQuery = entityManager.createNativeQuery(countSql);
		    //总记录数据
		    objTotalCount = countQuery.getSingleResult();
		    //分页查询
		    Query queryData = entityManager.createNativeQuery(sql);
		    queryData.unwrap(SQLQuery.class).setResultTransformer(Transformers.aliasToBean(clazz));
		    queryData.setFirstResult(page * size);
		    queryData.setMaxResults(size);
		    content = queryData.getResultList();
    	} catch(Exception e) {
    		logger.info("执行分页返回集合sql语句出错--{}", e.getMessage());
    		e.printStackTrace();
    	} finally {
    		//关闭entityManager
    		if(entityManager != null) {
    			entityManager.close();
    		}
    	}
		if(objTotalCount == null) {
			objTotalCount = 0;
		}
		Page<T> pageInfo = new PageImpl<T>(content, new PageRequest(page, size), Long.valueOf(objTotalCount.toString()));
		return pageInfo;
	}
	
	/**
	 * 返回集合条数
	 * @author zhao rui
	 * @date 2018年4月18日
	 * @param sql  SQL语句
	 * @return
	 */
	public int getResultCount(String sql){
		logger.info("执行返回集合条数");
		//返回记录条数
		int count = 0;
		//获取记录
		Object objTotalCount = null;
		//获取记录
		try {
			 //统计所有数据条数
		    Query countQuery = entityManager.createNativeQuery(sql);
		    //总记录数据
		    objTotalCount = countQuery.getSingleResult();
    	} catch(Exception e) {
    		logger.info("执行返回集合条数sql语句出错--{}", e.getMessage());
    	} finally {
    		//关闭entityManager
    		if(entityManager != null) {
    			entityManager.close();
    		}
    	}
		if(objTotalCount != null) {
			count = Integer.valueOf(objTotalCount.toString());
		}
		
		return count;
	}
}
