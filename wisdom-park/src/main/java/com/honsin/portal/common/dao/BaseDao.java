package com.honsin.portal.common.dao;  
  
import java.util.List;
import java.util.Map;

public interface BaseDao<T> {  

	/**  
	 * 获取单条数据
	 * @param id
	 * @return
	 */
	public T get(String id);
	
	/**
	 * 查询数据列表，
	 * @param entity
	 * @return
	 */
	public List<T> findList(T entity);
	
	/**
	 * 条件查询数据列表，
	 * @param entity
	 * @return
	 */
	public List<T> selectByParams(Map<String,Object> params);
	
	/**
	 * 条件查询记录数
	 * @param entity
	 * @return
	 */
	public int count(Map<String,Object> params);
	
	/**
	 * 插入数据
	 * @param entity
	 * @return
	 */
	public int insert(T entity);
	
	/**
	 * 更新数据
	 * @param entity
	 * @return
	 */
	public int update(T entity);
	
	/**
	 * 标记删除数据
	 * @param id
	 * @see public int delete(T entity)
	 * @return
	 */
	public int deleteByMark(String id);
	
	/**
	 * 物理删除数据
	 * @param id
	 * @see public int delete(T entity)
	 * @return
	 */
	public int deleteByPhysic(String id);

	/**
	 * 查询数据列表，如果需要分页，请设置分页对象
	 * @return
	 */
	public List<T> findAll();
  
}  