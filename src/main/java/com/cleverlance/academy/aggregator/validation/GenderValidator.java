package com.cleverlance.academy.aggregator.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class GenderValidator implements ConstraintValidator<Gender, String> {

    private static String MALE_VALUE = "MALE";
    private static String FEMALE_VALUE = "FEMALE";

    @Override
    public void initialize(Gender constraintAnnotation) {
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return MALE_VALUE.equals(s) || FEMALE_VALUE.equals(s);
    }
}
