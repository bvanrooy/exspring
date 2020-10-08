package be.abis.exercise.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import be.abis.exercise.model.Person;
import be.abis.exercise.service.PersonService;

@Controller
public class MainController {

	
	Logger logger = LoggerFactory.getLogger(MainController.class);
	
	
	@Autowired
	PersonService personService;
	
	Person personLoggedIn;
	
	@GetMapping("/")
	public String getLogin(Model model){
		logger.info("GET : getlogin");
		model.addAttribute("person", new Person());
		return "login";
	}
	
	@PostMapping("/")
	public String submitLogin(Person personLogin, BindingResult bindingResult) {
		logger.info("POST : submitlogin");
		personLoggedIn = personService.findPerson(personLogin.getEmailAddress(), personLogin.getPassword());
		if(personLoggedIn != null) {
			return "redirect:/index";
		}
		else {
			return "login";
		}
 
	}
	
	@GetMapping("/index")
	public String getIndex(Model model) {
		logger.info("Get : getIndex");
		logger.info("Get : index person logged in {}",personLoggedIn.toString());
		model.addAttribute("person",personLoggedIn);
		return "index";
	}
	
	@GetMapping("/searchCourse")
	public String getSearchCourse(Model model) {
		logger.info("Get : searchCourse");
		return "searchCourse";
	}

	@GetMapping("/persadmin")
	public String getPersAdmin(Model model) {
		logger.info("Get : persAdmin");
		return "searchCourse";
	}
}
