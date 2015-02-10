package at.oncohub.data.domain;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Patient extends AbstractEntity {

	private Long localPatientId;
	
	@OneToOne
	private Person person;
	
	
	public Patient() {
		this(null);
	}
	
	public Patient(Long id) {
		this.setId(id);
	}
	
	/**
	 * @return the localPatientId
	 */
	public Long getLocalPatientId() {
		return localPatientId;
	}

	/**
	 * @param localPatientId the localPatientId to set
	 */
	public void setLocalPatientId(Long localPatientId) {
		this.localPatientId = localPatientId;
	}

	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}

}
