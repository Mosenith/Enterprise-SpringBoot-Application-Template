package com.projecttemplate.template1.Dao.DataAccess.DataLayer;

import com.projecttemplate.template1.Dao.Common.Consts;

public class Dao {
    // TODO: get db data provider name from app config instead
    public static final IDaoFactory factory = DaoFactories.getFactory(Consts.DB_DATA_PROVIDER_MySql);


    /**
     * Gets a user data access object.
     */
    public static final IUserDao UserDao = factory.GetUserDao();


    /**
     * Gets a product data access object.
     */
    public static final IProductDao ProductDao = factory.GetProductDao();

} 
 