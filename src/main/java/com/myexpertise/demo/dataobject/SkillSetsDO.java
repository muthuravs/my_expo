
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
 *Unique skill sets for the user will be added to this table
 */
@Entity
@Table(name="skill_sets")
public class SkillSetsDO extends BaseExpertiseDO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "idskill_sets")
	private Integer idSkillSets;
	
	@Column(name = "name", nullable=false)
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@OneToMany(mappedBy = "skillSetsDO")
	private Set<UserSkillSetMapDO> userSkillsetMapDO;

	public Integer getIdSkillSets() {
		return idSkillSets;
	}

	public void setIdSkillSets(Integer idSkillSets) {
		this.idSkillSets = idSkillSets;
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

	public Set<UserSkillSetMapDO> getUserSkillsetMapDO() {
		return userSkillsetMapDO;
	}

	public void setUserSkillsetMapDO(Set<UserSkillSetMapDO> userSkillsetMapDO) {
		this.userSkillsetMapDO = userSkillsetMapDO;
	}
}
