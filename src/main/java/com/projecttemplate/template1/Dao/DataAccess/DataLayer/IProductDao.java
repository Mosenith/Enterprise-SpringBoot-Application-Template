package com.projecttemplate.template1.Dao.DataAccess.DataLayer;

import com.projecttemplate.template1.Dao.Model.Product;

/*
* Interface for Product data access
*/
public interface IProductDao {
    Product GetProduct(int productId);
}
