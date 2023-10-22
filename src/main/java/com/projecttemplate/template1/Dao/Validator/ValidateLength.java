package com.projecttemplate.template1.Dao.Validator;

 /**
 * This class is used for validating the length of value.
 */
public class ValidateLength extends ValidatorRule {
    private int _min;
    private int _max;
 
    /**
     * Constructor to set the following parameters.
     * @param propertyName: property name
     * @param min: minimum length
     * @param max: maximum length
     */
    public ValidateLength(String propertyName, int min, int max)         
    {
        super(propertyName);
        _min = min;
        _max = max;

        errorMessage = propertyName + " must be between " + _min + " and " + _max + " characters long.";
    }

     /**
     * Constructor to set the following parameters.
     * @param propertyName: property name
     * @param errorMessage: error message
     * @param min: minimum length
     * @param max: maximum length
     */
    public ValidateLength(String propertyName, String errorMessage, int min, int max)
    {
        this(propertyName, min, max);
        this.errorMessage = errorMessage;
    }


    /**
     * Override constructor
     * @param propertyName: property name
     * @param min: minimum length
     * @param max: maximum length
     * @return: user
     */
    public @Override boolean Validate(Validator validatorObject)
    {
        int length = getPropertyValue(validatorObject).toString().length();
        return length >= _min && length <= _max;
    }

}
