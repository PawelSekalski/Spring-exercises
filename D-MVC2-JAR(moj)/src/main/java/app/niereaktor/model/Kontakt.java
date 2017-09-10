package app.niereaktor.model;

public class Kontakt {
	
	private String imie;
	private String nazwisko;
	private String email;
	
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Kontakt() {}
	
	public Kontakt(String imie, String nazwisko, String email) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.email = email;
	
	}
	
}
