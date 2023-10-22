package com.projecttemplate.template1.Dao.DataAccess.DataLayer;

/**
 * Abstract factory interface for creating data access objects.
 */
public interface IDaoFactory {
    /**
     * Gets a user data access object.
     */
    IUserDao GetUserDao();

    /**
     * Gets a product data access object.
     */
    IProductDao GetProductDao();
}
