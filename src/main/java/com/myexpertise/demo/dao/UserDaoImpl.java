package com.myexpertise.demo.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.myexpertise.demo.base.dao.AbstractBaseDao;
import com.myexpertise.demo.dataobject.UserDO;
/**
 * 
 * @author Muthu
 *
 */
@Repository
public class UserDaoImpl extends AbstractBaseDao<UserDO> implements UserDao{

    @SuppressWarnings("unchecked")
    public List<UserDO> getUserByName(String name)
    {
        Query query = entityManager.createQuery("SELECT user FROM UserDO user WHERE user.userName= :name");
        query.setParameter("name", name);
        return query.getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<UserDO> getUserByEmailId(String email)
    {
        Query query = entityManager.createQuery("SELECT user FROM UserDO user WHERE user.emailId= :email");
        query.setParameter("email", email);
        return query.getResultList();
    }

}
