package com.myexpertise.demo.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.myexpertise.demo.base.BaseTests;
import com.myexpertise.demo.dao.UserDao;
import com.myexpertise.demo.dataobject.UserDO;

/**
 * 
 * @author Muthu
 *
 */
public class UserServiceTest extends BaseTests
{ 
    @Autowired
    private UserService userService;
    
    @Autowired
    private UserDao userDao;
    
    private UserDO userDO;
    
    @Before
    public void init()
    {
        userDO =  new UserDO();
        userDO.setActive(true);
        userDO.setEmailId("muthukumar.paramasivam@gmail.com");
        userDO.setPassword("123456");
        userDO.setPasswordHash("werastsdf");
        userDO.setPhoneNumber("9659003535");
        userDO.setUserName("Muthu");
        userDO.setCompanyId("RAV-181");
        userDO.setRole(1);      
        userDao.save(userDO);
    }
    
   @Test 
   @Transactional
   public void getUserByNameTests()
   {
       List<UserDO> users = userService.getUsersByName(userDO.getUserName());
       Assert.assertNotNull(users);
       Assert.assertEquals(1, users.size());
   }
   
   @Test
   @Transactional
   public void getUserByEmail()
   {
       List<UserDO> users =userService.getUsersByEmail(userDO.getEmailId());
       Assert.assertNotNull(users);
       Assert.assertTrue(users.get(0).isActive());
   }
}
