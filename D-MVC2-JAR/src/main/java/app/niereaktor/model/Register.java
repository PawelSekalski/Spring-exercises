package app.niereaktor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //encja rzutuje pola klasowe na pola danej tabeli
public class Register {
	
	
	@Id //określenie klucza głównego
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String login;
	private String pass;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public Register() {}
	
	public Register(String login, String pass) {
		super();
		this.login = login;
		this.pass = pass;
	
	}
	
}
