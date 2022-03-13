package com.cleverlance.academy.iotServer.validation;

import javax.validation.Constraint;

@Constraint(validatedBy = GenderValidator.class)
public @interface Gender {

    String message() default "Invalid gender value";

}
