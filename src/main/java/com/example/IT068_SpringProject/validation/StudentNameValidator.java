package com.example.IT068_SpringProject.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

@Component
public class StudentNameValidator implements ConstraintValidator<StudentNamePrefix, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // TODO Auto-generated method stub
        return value.startsWith("M");
    }
}
