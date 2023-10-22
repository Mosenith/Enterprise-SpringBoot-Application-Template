package com.projecttemplate.template1.Dao.DataAccess.DataLayer.SqlServer;

import com.projecttemplate.template1.Dao.DataAccess.DataLayer.IDaoFactory;
import com.projecttemplate.template1.Dao.DataAccess.DataLayer.IProductDao;
import com.projecttemplate.template1.Dao.DataAccess.DataLayer.IUserDao;

public class SqlServerDaoFactory implements IDaoFactory {
    /**
     * Gets a user data access object.
     */
    public IUserDao GetUserDao() {
        return new SqlServerUserDao();
    }

    /*
    * Gets a product data access object.
    */
    public IProductDao GetProductDao() {
        return new SqlServerProductDao();
    }
}
