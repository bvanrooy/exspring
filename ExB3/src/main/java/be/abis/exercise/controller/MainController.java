package be.abis.exercise.controller;

import java.io.IOException;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import be.abis.exercise.model.Person;
import be.abis.exercise.service.PersonService;

@Controller
public class MainController {

	
	Logger logger = LoggerFactory.getLogger(MainController.class);
	
	
	@Autowired
	PersonService personService;
	
	private Person personLoggedIn;
	private ArrayList<Person> personList;
	
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
		if(personLoggedIn != null) {
			logger.info("Get : index person logged in {}",personLoggedIn.toString());
			model.addAttribute("person",personLoggedIn);
			return "index";
		}
		else {
			logger.info("Get : getIndex not logged in");
			return "redirect:/login";
		}
	}
	
	@GetMapping("/searchcourse")
	public String getSearchCourse(Model model) {
		logger.info("Get : searchCourse");
		model.addAttribute("person",personLoggedIn);
		return "searchCourse";
	}

	@GetMapping("/persadmin")
	public String getPersAdmin(Model model) {
		logger.info("Get : persAdmin");
		model.addAttribute("person",personLoggedIn);
		return "persadmin";
	}
	
	@GetMapping("/changepwd")
	public String getChangePassword(Model model) {
		logger.info("Get : changepwd");
		model.addAttribute("person",new Person());
		model.addAttribute("msg","");
		model.addAttribute("error","");
		return "changepwd";
	}
	
	@PostMapping("/changepwd")
	public String submitChangePassword(Person person, BindingResult bindingResult, Model model)  {
		logger.info("POST : submitChangePassword");
		logger.info("POST : changepwd person logged in {}",personLoggedIn.toString());
		try {
		personService.changePassword(personLoggedIn, person.getPassword());
		}
		catch(IOException ex) {
			model.addAttribute("error", "Error changing password");
		}
		model.addAttribute("msg", "Password succesfully updated");
		return "changepwd";
 
	}
	
	@GetMapping("/searchperson")
	public String getSearchPerson(Model model) {
		logger.info("Get : searchperson");
		setUpPersonList();
		logger.info("GET : searchperson found {}",personList.size());
		model.addAttribute("person",new Person());
		model.addAttribute("personlist",personList);
		model.addAttribute("msg","");
		model.addAttribute("error","");
		return "searchperson";
	}
	
	@PostMapping("/searchpersonbyid")
	public String searchPersonById(Person person, BindingResult bindingResult, Model model)  {
		logger.info("POST : searchPersonById");
		String msg;
		String error;
		setUpPersonList();
		personList.clear();
		personList.add(personService.findPerson(person.getPersonId()));
		logger.info("POST : searchPersonById found {}",personList.size());
		if(personList.size()==0) {
			error = "Person not found";
		}
		model.addAttribute("personlist",personList);
		model.addAttribute("msg","");
		model.addAttribute("error","");
		return "redirect:/searchperson";
 	}
	
	
	@PostMapping("/searchpersonall")
	public String searchPersonByAll(Person person, BindingResult bindingResult, Model model)  {
		logger.info("POST : searchPersonById");
		setUpPersonList();
		personList.clear();
		personList.addAll(personService.getAllPersons());
		model.addAttribute("personlist",personList);
		model.addAttribute("msg","");
		model.addAttribute("error","");
		return "redirect:/searchperson";
 	}
	
	
	
	@GetMapping("/personform")
	public String getPersonForm(Model model,@RequestParam(required = false) Integer id){
		logger.info("GET : personForm");
		Person personExisting=null;
		if(id != null) {
			personExisting = personService.findPerson(id);
		}
		if(personExisting == null) {
			model.addAttribute("person", new Person());
		}
		else {
			model.addAttribute("person", personExisting);
		}
		return "personform";
	}
	
	@PostMapping("/personform")
	public String submitPersonForm(Person person, BindingResult bindingResult, Model model) {
		String msg = null;
		String error = null;
		
		logger.info("POST : personform");
		
		try {
			personService.addPerson(person);
			msg="Person saved";
			
		} catch (IOException e) {
			error = "Error saving person";
			e.printStackTrace();
		}
		model.addAttribute("person", person);
		model.addAttribute("msg", msg);
		model.addAttribute("error", error);
		return "personform";
	}
	
	
	
	@GetMapping("/deleteperson")
	public String getDeletePerson(Model model) {
		logger.info("Get : deleteperson");
		model.addAttribute("person",new Person());
		model.addAttribute("msg","");
		model.addAttribute("error","");
		return "deleteperson";
	}
	
	@PostMapping("/deleteperson")
	public String submitDeletePerson(Person personToDelete, BindingResult bindingResult, Model model)  {
		logger.info("POST : deleteperson");
		logger.info("POST : deleteperson person to delete {}",personToDelete.getPersonId());
		personService.deletePerson(personToDelete.getPersonId());
		model.addAttribute("msg", "Person successfully deleted");
		return "deleteperson";
 
	}
	

	
	
	
	
	
	
	
	
	private void setUpPersonList() {
		if(personList == null) {
			personList = new ArrayList<>();
		}

	}
}




