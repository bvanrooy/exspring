package be.abis.exercise.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import be.abis.exercise.validation.PasswordConfirmation;

@PasswordConfirmation
public class Password {
	
	@NotBlank
	@Size(min=6,message="Password should be at least 6 characters")
	private String password;
	@NotBlank
	@Size(min=6,message="Confirm password should be at least 6 characters")
	private String confirmPassword;
	
	public Password() {
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	
	
	
	
}
