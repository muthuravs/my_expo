package com.myexpertise.demo.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.myexpertise.demo.base.BaseTests;
import com.myexpertise.demo.dataobject.UserDO;

/**
 * 
 * @author Muthu
 *
 */
public class UserDaoTests extends BaseTests
{
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
        List<UserDO> user = userDao.getUserByName(userDO.getUserName());
        Assert.assertNotNull(user);
        Assert.assertEquals("9659003535", userDO.getPhoneNumber());
    }    
    @Test
    @Transactional
    public void getUserByEmailTests()
    {
        List<UserDO> user = userDao.getUserByName(userDO.getEmailId());
        Assert.assertNotNull(user);
        Assert.assertNotEquals("", userDO.getCompanyId());
    }
}
