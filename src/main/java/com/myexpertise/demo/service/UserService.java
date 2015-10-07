package com.myexpertise.demo.service;

import java.util.List;

import com.myexpertise.demo.dataobject.UserDO;

/**
 * 
 * @author Muthu
 *
 */
public interface UserService
{

    /**
     * Get users by name.
     * @param name
     * @return users list
     */
    public List<UserDO> getUsersByName(String name);
    
    /**
     * Get users by email.
     * @param name
     * @return users list
     */
    public List<UserDO> getUsersByEmail(String email);

}
