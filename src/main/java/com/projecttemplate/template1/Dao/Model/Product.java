package com.projecttemplate.template1.Dao.Model;

import com.projecttemplate.template1.Dao.Validator.Validator;

/*
* Product data model
*/
public class Product extends Validator {
    
    /*
    * Default Product constructor with
    * validation rules
    */
    public Product() {
        // TODO: Add validator rules
    }

    /*
    * Product constructor with 2 parameters
    * @param productId: product identifier
    * @param productName: product name
    */
    public Product(int productId, String productName)
    {
        // call the default constructor to add validation rules
        this();
        
        ProductId = productId;
        ProductName = productName;
    }

    /*
    * Product identifier
    */
    public int ProductId;
 
    /*
    * Product name
    */
    public String ProductName;

}
