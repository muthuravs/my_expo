package com.myexpertise.demo.base.dao;

import java.util.List;

import com.myexpertise.demo.base.dataobject.BaseDO;

/**
 * 
 * @author Muthu
 *
 * @param <T> Entity object
 */
public interface Dao<T extends BaseDO> {

	/**
	 * persist the object to the database
	 * @param T
	 * @return
	 */
	void save(T domainObject);
	
	/**
	 * merge the object to the database
	 * @param T
	 * @return
	 */
	void update(T entity);
	
	/**
	 * Get the matching object by id filter
	 * @param T
	 * @return
	 */
	T get(Class<T> domainClass, Integer integer);
	
	/**
	 * Get all the matching objects by domainobject
	 * @param domainClass
	 * @param domainObject
	 * @return
	 */
	List<T> get(Class<T> domainClass, T domainObject);
}
