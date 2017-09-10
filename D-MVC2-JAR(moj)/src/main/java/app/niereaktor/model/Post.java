package app.niereaktor.model;

public class Post {
	
	private String tytul;
	private String tresc;
	private String podpis;
	
	public String getTytul() {
		return tytul;
	}
	public void setTytul(String tytul) {
		this.tytul = tytul;
	}
	public String getTresc() {
		return tresc;
	}
	public void setTresc(String tresc) {
		this.tresc = tresc;
	}
	public String getPodpis() {
		return podpis;
	}
	public void setPodpis(String podpis) {
		this.podpis = podpis;
	}
	
	public Post() {}
	
	public Post(String tytul, String tresc, String podpis) {
		super();
		this.tytul = tytul;
		this.tresc = tresc;
		this.podpis = podpis;
	}
	
}
