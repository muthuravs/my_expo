
package com.myexpertise.demo.dataobject;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.myexpertise.demo.base.dataobject.BaseExpertiseDO;

/**
 * This class will have the user's personal information
 * @author Muthu
 *
 */
@Entity
@Table(name= "user", uniqueConstraints = {@UniqueConstraint(columnNames = {"user_name", "email_id"})})
public class UserDO extends BaseExpertiseDO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "iduser", nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idUser;
	
	@Column(name = "user_name", nullable = false)	
	private String userName;
	
	@Column(name = "email_id")
	private String emailId;
	
	@Column(name="password")
	private String password;
	
	@Column(name="password_hash")
	private String passwordHash;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="profile_image_path")
	private String profileImagePath;
	
	@Column(name = "company_id")
	private String companyId;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name = "team")
	private TeamDO team;
	
	@OneToMany(mappedBy = "userDO")
	private Set<UserSkillSetMapDO> userSkillSetMap;
	
	@Column(name = "role")
	private Integer role;

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getProfileImagePath() {
		return profileImagePath;
	}

	public void setProfileImagePath(String profileImagePath) {
		this.profileImagePath = profileImagePath;
	}

    public Integer getRole()
    {
        return role;
    }

    public void setRole(Integer role)
    {
        this.role = role;
    }

    public String getCompanyId()
    {
        return companyId;
    }

    public void setCompanyId(String companyId)
    {
        this.companyId = companyId;
    }
	
	
	//User belongs to this team
	
	//User has this role
	
}
