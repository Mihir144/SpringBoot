package com.example.IT068_SpringProject.validation;

import java.lang.annotation.*;

import javax.validation.Constraint;
import javax.validation.Payload;

//import com.sun.istack.NotNull;


@Documented
@Constraint(validatedBy = StudentNameValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface StudentNamePrefix {
    String message() default "Name must be prefixed with CRS";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

//class UserNotNull {
//    
//    @NotNull()
//    private String studentName;
//    
//    // standard constructors / getters / toString   
//}