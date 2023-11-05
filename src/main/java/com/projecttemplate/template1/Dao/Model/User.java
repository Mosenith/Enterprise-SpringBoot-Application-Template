package com.projecttemplate.template1.Dao.Model;

import com.projecttemplate.template1.Dao.Validator.ValidateLength;
import com.projecttemplate.template1.Dao.Validator.ValidateRequired;
import com.projecttemplate.template1.Dao.Validator.Validator;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*
* User data model
*/
@Entity
public class User extends Validator {

    /*
    * Default User constructor with
    * validation rules
    */
    public User() {
        // Validator rules
        AddRule(new ValidateRequired("UserName"));
        AddRule(new ValidateLength("UserName", 1, 30));

        AddRule(new ValidateRequired("Password"));
        AddRule(new ValidateLength("Password", 1, 30));
    }

    /*
    * User constructor with 2 parameters
    * @param userName: user name
    * @param password: user password
    */
    public User(String userName, String password)
    {
        // call the default constructor to add validation rules
        this();
        
        UserName = userName;
        Password = password;
    }

     
    /*
    * User identifier
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int UserId;

    /*
    * User name
    */
    public String UserName;

    /*
    * User password
    */
    public String Password;

}
