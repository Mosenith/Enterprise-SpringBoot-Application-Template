package com.projecttemplate.template1.Dao.DataAccess.DataLayer;

import com.projecttemplate.template1.Dao.Model.User;

/*
* Interface for user data access
*/
public interface IUserDao {
    
    /**
     * This method is used to find a specific user by id.
     * @param userId: Unique user identifier
     * @return: user
     */
    User getUser(int userId);


     /**
     * This method is used to check if a given user is valid.
     * @param userName: user name
     * @param password: user password
     * @return: boolean
     */
    boolean Login(String userName, String password);
}

 
