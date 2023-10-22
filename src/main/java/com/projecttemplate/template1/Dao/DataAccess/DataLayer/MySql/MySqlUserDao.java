package com.projecttemplate.template1.Dao.DataAccess.DataLayer.MySql;

import com.projecttemplate.template1.Dao.DataAccess.DataLayer.IUserDao;
import com.projecttemplate.template1.Dao.Model.User;

public class MySqlUserDao implements IUserDao {
    /**
     * This method is used to find a specific user by id.
     * @param userId: Unique user identifier
     * @return: user
     */
    public User getUser(int userId) {
        // TODO: update to get user from database
        User usr = new User();
        usr.UserId = 2;
        usr.UserName = "John Cena 2";

        return usr;
    }

    /**
     * This method is used to check if a given user is valid.
     * @param userName: user name
     * @param password: user password
     * @return: boolean
     */
    public boolean Login(String userName, String password) {
        // TODO: update to check user in database

        if (userName.equals("johncena2") && password.equals("cenapassword2")) {
            return true;
        } else {
            return false;
        }
    }
}

