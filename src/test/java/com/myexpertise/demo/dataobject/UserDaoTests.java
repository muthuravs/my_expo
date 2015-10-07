package com.myexpertise.demo.dataobject;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.myexpertise.demo.base.BaseTests;
import com.myexpertise.demo.dao.UserDao;


/**
 * 
 * @author Muthu
 *
 */
public class UserDaoTests extends BaseTests {

	@Autowired
	private UserDao userDao;
	
	@Test
	@Transactional
	public void addNewUserRole()
	{
		UserDO userDO =  new UserDO();
		userDO.setActive(true);
		userDO.setEmailId("muthukumar.paramasivam@gmail.com");
		userDO.setPassword("123456");
		userDO.setPasswordHash("werastsdf");
		userDO.setPhoneNumber("9659003535");
		userDO.setUserName("Muthu");
		userDO.setCompanyId("RAV-181");
		userDO.setRole(1);		
		userDao.save(userDO);
		Assert.assertNotNull(userDO.getIdUser());
	}
}
