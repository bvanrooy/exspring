package be.abis.exercise.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.abis.exercise.model.Person;
import be.abis.exercise.repository.PersonRepository;

@Service
public class AbisPersonService implements PersonService {

	@Autowired
	PersonRepository personRepository;
	
	@Override
	public ArrayList<Person> getAllPersons() {
		return personRepository.getAllPersons(); 
	}

	@Override
	public Person findPerson(int id) {
		return personRepository.findPerson(id);
	}

	@Override
	public Person findPerson(String emailAddress, String passWord) {
		return personRepository.findPerson(emailAddress, passWord);
	}

	@Override
	public void addPerson(Person p) throws IOException {
		int id;
		List<Person> personList= this.getAllPersons();
		id=personList.get(personList.size()-1).getPersonId() + 1;
		p.setPersonId(id);
		personRepository.addPerson(p);

	}

	@Override
	public void deletePerson(int id) {
		personRepository.deletePerson(id);

	}

	@Override
	public void changePassword(Person p, String newPswd) throws IOException {
		personRepository.changePassword(p, newPswd);

	}

}