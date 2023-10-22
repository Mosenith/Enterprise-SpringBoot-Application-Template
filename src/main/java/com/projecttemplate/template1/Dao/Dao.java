package com.projecttemplate.template1.Dao;

import com.projecttemplate.template1.Dao.DataAccess.DataLayer.IProductDao;
import com.projecttemplate.template1.Dao.DataAccess.DataLayer.IUserDao;
import com.projecttemplate.template1.Dao.DataAccess.DataLayer.SqlServer.SqlServerProductDao;
import com.projecttemplate.template1.Dao.DataAccess.DataLayer.SqlServer.SqlServerUserDao;

/**
 * This class is used for all data access objects.
 */
public class Dao {
      
     /**
     * User data access object.
     */
    public IUserDao UserDao()
    {
        return new SqlServerUserDao();
    }


    /**
     * Product data access object.
     */
    public IProductDao ProductDao()
    {
        return new SqlServerProductDao();
    }
}
