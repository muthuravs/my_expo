package com.myexpertise.demo.dataobject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.myexpertise.demo.base.dataobject.BaseExpertiseDO;

/**
 * 
 * @author muthu_k
 *Roles will be assigned to the user
 */
@Entity
@Table(name = "role")
public class RoleDO extends BaseExpertiseDO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idrole")
	private Integer idRole;
	
	@Column(name="name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name="identifier")
	private String identifier;

	public Integer getIdRole() {
		return idRole;
	}

	public void setIdRole(Integer idRole) {
		this.idRole = idRole;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
}
