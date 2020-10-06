package be.abis.exercise.it;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import be.abis.exercise.model.Person;
import be.abis.exercise.repository.FilePersonRepository;
import be.abis.exercise.repository.PersonRepository;

public class TestPersonRepository {
	
	PersonRepository pr;
	
	@Before
	public void setUp() {
		pr=new FilePersonRepository();
	}
	
	@Test
	public void startSizeOfFileIs3() {
		int size = pr.getAllPersons().size();
		assertEquals(3,size);
	}
	
	@Test
	public void person1isJohn() {
		Person p = pr.findPerson(1);
		assertEquals("John",p.getFirstName());
	}
	
	@Test
	public void personViaMailAndPwdisMary() {
		Person p = pr.findPerson("mjones@abis.be","abc123");
		assertEquals("Mary",p.getFirstName());
	}
	
	

}
