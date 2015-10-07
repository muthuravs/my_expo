package com.myexpertise.demo.dataobject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.Index;

import com.myexpertise.demo.base.dataobject.BaseExpertiseDO;

/**
 * 
 * @author muthu_k
 * User's will be mapped to the skill set
 * A user can have multiple skill sets
 */
@Entity
@Table(name = "user_skill_set_map")
public class UserSkillSetMapDO extends BaseExpertiseDO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "iduser_skill_set_map")
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idUserSkillSetMap;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user", nullable=false)
	@ForeignKey(name="user_fk")
	@Index(name="user_idx")
	private UserDO userDO;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="skill_set", nullable=false)
	@ForeignKey(name="skill_set_fk")
	@Index(name="skill_set_fk_idx")
	private SkillSetsDO skillSetsDO;

	public Integer getIdUserSkillSetMap() {
		return idUserSkillSetMap;
	}

	public void setIdUserSkillSetMap(Integer idUserSkillSetMap) {
		this.idUserSkillSetMap = idUserSkillSetMap;
	}

	public UserDO getUserDO() {
		return userDO;
	}

	public void setUserDO(UserDO userDO) {
		this.userDO = userDO;
	}

	public SkillSetsDO getSkillSetsDO() {
		return skillSetsDO;
	}

	public void setSkillSetsDO(SkillSetsDO skillSetsDO) {
		this.skillSetsDO = skillSetsDO;
	}
}
