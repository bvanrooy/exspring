package be.abis.exercise.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import be.abis.exercise.model.Password;

public class PasswordConfirmationValidator implements ConstraintValidator<PasswordConfirmation, Password> {

	@Override
	public boolean isValid(Password password, ConstraintValidatorContext context) {
		
		return (password.getPassword().equals(password.getConfirmPassword()));
	}
	

}
