package com.projecttemplate.template1.Dao.Validator;
 
 /**
 * This class is used for validating the required value.
 */
public class ValidateRequired extends ValidatorRule {

    public ValidateRequired(String propertyName) 
    {
        super(propertyName);
        errorMessage = propertyName + " is a required field.";
    }

    public ValidateRequired(String propertyName, String errorMessage)
    {
        super(propertyName);
        this.errorMessage = errorMessage;
    }

    public @Override boolean Validate(Validator validatorObject)
    {
        try
        {
            return getPropertyValue(validatorObject).toString().length() > 0;
        }
        catch(NullPointerException ex)
        {
            return false;
        }
    }
}
