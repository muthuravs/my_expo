package com.myexpertise.demo.dataobject;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.myexpertise.demo.base.dataobject.BaseExpertiseDO;

/**
 * 
 * @author muthu_k
 * This class will have the team information of the user
 */
@Entity
@Table(name = "team")
public class TeamDO extends BaseExpertiseDO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "idteam", nullable = false)
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idTeam;
	
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@OneToMany(mappedBy = "team")
	private Set<UserDO> users;

	public Integer getIdTeam() {
		return idTeam;
	}

	public void setIdTeam(Integer idTeam) {
		this.idTeam = idTeam;
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

	public Set<UserDO> getUsers() {
		return users;
	}

	public void setUsers(Set<UserDO> users) {
		this.users = users;
	}
}
