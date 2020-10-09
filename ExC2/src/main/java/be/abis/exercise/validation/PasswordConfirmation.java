package be.abis.exercise.validation;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target(TYPE)
@Constraint(validatedBy=PasswordConfirmationValidator.class)
public @interface PasswordConfirmation {

	String message() default "Password and confirmation do not match";
	
	Class<?>[] groups() default{};
	Class<? extends Payload>[] payload() default{};
}
