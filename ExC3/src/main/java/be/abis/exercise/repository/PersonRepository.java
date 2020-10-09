package be.abis.exercise.repository;

import java.io.IOException;
import java.util.ArrayList;

import be.abis.exercise.exception.PersonAllreadyExistsException;
import be.abis.exercise.exception.PersonNotFoundException;
import be.abis.exercise.model.Person;


public interface PersonRepository {
	
	    ArrayList<Person> getAllPersons();
	    Person findPerson(int id);
	    Person findPerson(String emailAddress, String passWord);
	    void addPerson(Person p) throws IOException, PersonAllreadyExistsException;
	    public void deletePerson(int id) throws PersonNotFoundException;
	    void changePassword(Person p, String newPswd) throws IOException;

}
