package at.oncohub.data.repository;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import at.oncohub.data.PersistenceContext;
import at.oncohub.data.domain.EmailAddress;
import at.oncohub.data.domain.Person;

/**
 * Integration test showing the basic usage of {@link PersonRepository}.
 * 
 * @author Patrick Huber
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = PersistenceContext.class)
public class PersonRepositoryIntegrationTests {

	@Autowired 
	PersonRepository repository;
	Person person;
	
	@Before
	public void setUp() {
		person = new Person();
		person.setFirstname("Patrick");
		person.setLastname("Huber");
		person.setBirthdate(LocalDate.of(1987, 12, 7));
		person.setGender("male");
		
		EmailAddress email = new EmailAddress("patrick.huber@meduniwien.ac.at");
		person.setEmailAddress(email);
	}

	@Test
	public void findSavedUserById() {
		person = repository.save(person);
		assertEquals(person, repository.findOne(person.getId()));
		//assertThat(person.getCreatedDate(), is(notNullValue()));
		//assertThat(person.getLastModifiedDate(), is(notNullValue()));
	}
	
//	@Test
//	public void findSavedUserByLastname() throws Exception {
//		person = repository.save(person);
//		List<Person> persons = repository.findByLastname("Huber");
//		assertNotNull(persons);
//		assertTrue(persons.contains(person));
//	}
//	
//	@Test
//	public void findByFirstnameOrLastname() throws Exception {
//		person = repository.save(person);
//		List<Person> persons = repository.findByFirstnameOrLastname("Huber");
//		assertTrue(persons.contains(person));
//	}
	

}
