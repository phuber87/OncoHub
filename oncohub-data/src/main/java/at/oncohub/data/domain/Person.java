package at.oncohub.data.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;


@Entity
public class Person extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 1123535415893997380L;
	
	private String firstname;
	private String lastname;
	@Column(unique = true)
	private EmailAddress emailAddress;
	private String gender; // datatype should be "Enum"
	private LocalDate birthdate;
	private Boolean birthdateEstimated = false;
	private Boolean dead = false;
	private LocalDate deathdate;
	private Boolean deathdateEstimated = false;
	private String causeOfDeath; // datatype should be "Concept"
		
	
	/** 
	 * Constructor methods
	 */
	public Person() {
		this(null);
	}
	
	public Person(Long id) {
		this.setId(id);
	}
	
	/**
	 * Getter and Setter methods
	 */
	/**
	* @return the firstname
	*/
	public String getFirstname() {
		return firstname;
	}
	
	/**
	* @param firstname the firstname to set
	*/
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	/**
	* @return the lastname
	*/
	public String getLastname() {
		return lastname;
	}
	
	/**
	* @param lastname the lastname to set
	*/
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	/**
	* Returns the {@link EmailAddress} of the {@link Person}.
	*
	* @return
	*/
	public EmailAddress getEmailAddress() {
		return emailAddress;
	}
	
	/**
	* Sets the {@link Person}'s {@link EmailAddress}.
	*
	* @param emailAddress must not be {@literal null}.
	*/
	public void setEmailAddress(EmailAddress emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the birthdate
	 */
	public LocalDate getBirthdate() {
		return birthdate;
	}

	/**
	 * @param birthdate the birthdate to set
	 */
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	/**
	 * @return the birthdateEstimated
	 */
	public Boolean getBirthdateEstimated() {
		return birthdateEstimated;
	}

	/**
	 * @param birthdateEstimated the birthdateEstimated to set
	 */
	public void setBirthdateEstimated(Boolean birthdateEstimated) {
		this.birthdateEstimated = birthdateEstimated;
	}

	/**
	 * @return the dead
	 */
	public Boolean getDead() {
		return dead;
	}

	/**
	 * @param dead the dead to set
	 */
	public void setDead(Boolean dead) {
		this.dead = dead;
	}

	/**
	 * @return the deathdate
	 */
	public LocalDate getDeathdate() {
		return deathdate;
	}

	/**
	 * @param deathdate the deathdate to set
	 */
	public void setDeathdate(LocalDate deathdate) {
		this.deathdate = deathdate;
	}

	/**
	 * @return the deathdateEstimated
	 */
	public Boolean getDeathdateEstimated() {
		return deathdateEstimated;
	}

	/**
	 * @param deathdateEstimated the deathdateEstimated to set
	 */
	public void setDeathdateEstimated(Boolean deathdateEstimated) {
		this.deathdateEstimated = deathdateEstimated;
	}

	/**
	 * @return the causeOfDeath
	 */
	public String getCauseOfDeath() {
		return causeOfDeath;
	}

	/**
	 * @param causeOfDeath the causeOfDeath to set
	 */
	public void setCauseOfDeath(String causeOfDeath) {
		this.causeOfDeath = causeOfDeath;
	}
	
}
