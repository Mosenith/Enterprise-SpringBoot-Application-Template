package com.projecttemplate.template1.Dao.Validator;

import java.lang.reflect.Field;
  
/**
 * Abstract base class for validator rules.
 * Maintains property name to which rule applies and validation error message.
 */
 
public abstract class ValidatorRule {
    protected String propertyName;
    protected String errorMessage;
    
    /**
     * Default constructor to set the following parameter.
     * @param propertyName: property name to which rule applies
     */
    public ValidatorRule(String propertyName) {
        this.propertyName = propertyName;
        this.errorMessage = propertyName + " is not valid";
    }
   
    /**
     * Overloaded constructor to set the following parameters.
     * @param propertyName: property name
     * @param errorMessage: error message
     */
    public ValidatorRule(String propertyName, String errorMessage) {
        // Call the default constructor
        this(propertyName);
        this.errorMessage = errorMessage;
    }
   

    /**
     * Validation method. To be implemented in derived classes.
     * @param validatorObject: object to be validated
     */
    public abstract boolean Validate(Validator validatorObject);
   

     /**
     * Method to get value for given object's property using reflection.
     * @param validatorObject: object to be validated
     * @return: value of the object's property
     */ 
    protected Object getPropertyValue(Validator validatorObject)
    {        
        try { 
             return getPropertyValueByName(propertyName, validatorObject);
        } catch (Exception ex) {
            return null;
        }
    }

    private Object getPropertyValueByName(String propertyName, Object valObject) {
        try {
            for (Field f : valObject.getClass().getDeclaredFields()) {
                if (propertyName == f.getName()) {
                    f.setAccessible(true);
                    return f.get(valObject) == null ? "" : f.get(valObject);
                }  
            }
        } catch (Exception ex) {
            return "";
        }

        return "";
    }
}
