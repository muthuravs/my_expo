package com.myexpertise.demo.dao;

import java.util.List;

import com.myexpertise.demo.base.dao.Dao;
import com.myexpertise.demo.dataobject.UserDO;



/**
 * 
 * @author Muthu
 *
 */
public interface UserDao extends Dao<UserDO>{
    
    /**
     * 
     * @param name
     * @return List of Users with the given name
     */
    public List<UserDO> getUserByName(String name);
    
    /**
     * 
     * @param email
     * @return List of users with the given email id
     */
    public List<UserDO> getUserByEmailId(String email);

}
