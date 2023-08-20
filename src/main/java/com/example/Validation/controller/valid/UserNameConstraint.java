package com.example.Validation.controller.valid;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = {UserParameterValidator.class})
@Target( { METHOD, FIELD, PARAMETER})
@Retention(RUNTIME)
public @interface UserNameConstraint{

    String message() default "Invalid User name";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};


}

