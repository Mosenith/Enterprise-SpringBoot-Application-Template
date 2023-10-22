package com.projecttemplate.template1.Dao.DataAccess.DataLayer.SqlServer;

import com.projecttemplate.template1.Dao.DataAccess.DataLayer.IProductDao;
import com.projecttemplate.template1.Dao.Model.Product;

public class SqlServerProductDao implements IProductDao
    { 
        /*
         * Find product by id
         */

         /**
         * Find product by id
         * @param productId: product identifier
         * @return: product
         */
        public Product GetProduct(int productId) {
            // TODO: update to get product from database
            Product prd = new Product();
            prd.ProductId = 1;
            prd.ProductName = "iPhone 14 Max Pro";

            return prd;
        }
 
    }

