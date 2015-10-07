package com.myexpertise.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myexpertise.demo.dao.UserDao;
import com.myexpertise.demo.dataobject.UserDO;

/**
 * 
 * @author Muthu
 *
 */
@Service
public class UserServiceImpl implements UserService
{ 
    @Autowired
    private UserDao userDao;
    
    @Transactional
    public List<UserDO> getUsersByName(String name)
    {
        return userDao.getUserByName(name);
    }
    
    @Transactional
    public List<UserDO> getUsersByEmail(String email)
    {
        return userDao.getUserByEmailId(email);
    }
}
