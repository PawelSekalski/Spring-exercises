package app.niereaktor.model;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;

public class Person {
		
	@NotEmpty(message ="{app.niereaktor.model.Person.firstN.NotEmpty}") //żeby pole nie było puste
	private String firstN;
	@NotEmpty(message ="{app.niereaktor.model.Person.lastN.NotEmpty}")
	private String lastN;
	@Email(message ="{app.niereaktor.model.Person.email.Email}")
	@NotEmpty(message ="{app.niereaktor.model.Person.email.NotEmpty}")
	private String email;
	@Min(value=18, message="{app.niereaktor.model.Person.age.Min}")
	private int age;
	
	public String getFirstN() {
		return firstN;
	}
	public void setFirstN(String firstN) {
		this.firstN = firstN;
	}
	public String getLastN() {
		return lastN;
	}
	public void setLastN(String lastN) {
		this.lastN = lastN;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person() {}
	
	public Person(String firstN, String lastN, String email, int age) {
		super();
		this.firstN = firstN;
		this.lastN = lastN;
		this.email = email;
		this.age = age;
	}

}
