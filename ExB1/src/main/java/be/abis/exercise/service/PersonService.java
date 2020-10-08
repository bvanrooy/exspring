package be.abis.exercise.service;

import java.io.IOException;
import java.util.ArrayList;

import be.abis.exercise.model.Person;

public interface PersonService {
    ArrayList<Person> getAllPersons();
    Person findPerson(int id);
    Person findPerson(String emailAddress, String passWord);
    void addPerson(Person p) throws IOException;
    public void deletePerson(int id);
    void changePassword(Person p, String newPswd) throws IOException;

}