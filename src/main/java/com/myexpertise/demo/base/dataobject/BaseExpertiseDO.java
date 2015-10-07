package com.myexpertise.demo.base.dataobject;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * This class abstracts out the is_active, created_date and updated_date
 * which is common to all the data objects
 * @author muthu_k
 *
 */
public abstract class BaseExpertiseDO implements BaseDO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// True if the flag is active
	@Column(name = "is_active", nullable = false, columnDefinition = "boolean default TRUE")
	private Boolean isActive = Boolean.TRUE;
	
	// Creation date time.
	@Column(name = "created_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	
	// Last updated date time.
	@Column(name = "updated_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}	
}
