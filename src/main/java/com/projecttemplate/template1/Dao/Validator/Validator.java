package com.projecttemplate.template1.Dao.Validator;

import java.util.ArrayList;
import java.util.List;

 /**
 * Abstract base class for validator rules.
 * Contains basic validation rule infrastructure.
 */
public abstract class Validator {
    
    /**
     * Method to get value for given object's property using reflection.
     * @param validatorObject: object to be validated
     * @return: value of the object's property
     */ 
     

    // List of validator rules
    private List<ValidatorRule> _validatorRules = new ArrayList<ValidatorRule>();

    // List of validation errors (following validation failure)
    private List<String> _validationErrors = new ArrayList<String>();

    /// <summary>
    /// Gets list of validations errors.
    /// </summary>
    public List<String> getValidationErrors() {
        return _validationErrors;
    }
 

    /**
     * Adds a validator rule to the validator object.
     * @param rule: validator rule
     */ 
    protected void AddRule(ValidatorRule rule) {
        _validatorRules.add(rule);
    }

    /**
     * Determines whether validator rules are valid or not.
     * Creates a list of validation errors when appropriate.
     * @return true if all rules are met, false otherwise
     */ 
    public boolean validate() {
        boolean isValid = true;

        _validationErrors.clear();
        for (ValidatorRule rule : _validatorRules) {
            if (!rule.Validate(this)) {
                isValid = false;
                _validationErrors.add(rule.errorMessage);
            }
        }
        return isValid;
    }
}
