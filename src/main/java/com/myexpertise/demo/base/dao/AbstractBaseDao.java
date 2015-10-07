package com.myexpertise.demo.base.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.myexpertise.demo.base.dataobject.BaseExpertiseDO;

/**
 * Abstracting the generic methods which will be used across all the DAO.
 * 
 * @author Muthu
 *
 * @param <T>
 */
public abstract class AbstractBaseDao<T extends BaseExpertiseDO> implements Dao<T>{

	// get the entity manager instance.	
	protected EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public void save(T domainObject)
	{
		entityManager.persist(domainObject);
	}
	
	public void update(T domainObject)
	{
		entityManager.merge(domainObject);
	}
	
	public T get(Class<T> domainClass, Integer id)
	{
		return entityManager.find(domainClass, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> get(Class<T> domainClass, T domainObject)
	{
		return (List<T>) entityManager.find(domainClass, domainObject);
	}
 }
