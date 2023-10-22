package com.projecttemplate.template1.Dao.DataAccess.DataLayer.MySql;

import com.projecttemplate.template1.Dao.DataAccess.DataLayer.IDaoFactory;
import com.projecttemplate.template1.Dao.DataAccess.DataLayer.IProductDao;
import com.projecttemplate.template1.Dao.DataAccess.DataLayer.IUserDao;

public class MySqlDaoFactory implements IDaoFactory{
    /**
     * Gets a user data access object.
     */
    public IUserDao GetUserDao() {
        return new MySqlUserDao();
    }

    /*
    * Gets a product data access object.
    */
    public IProductDao GetProductDao() {
        return new MySqlProductDao();
    }
}
