package app.niereaktor.model;

public class Credit {
	
	public double kwotaKredytu;
	public int czasSplaty;
	public double p = 0.1;
	
	public double getKwotaKredytu() {
		return kwotaKredytu;
	}
	public void setKwotaKredytu(double kwotaKredytu) {
		this.kwotaKredytu = kwotaKredytu;
	}
	public int getCzasSplaty() {
		return czasSplaty;
	}
	public void setCzasSplaty(int czasSplaty) {
		this.czasSplaty = czasSplaty;
	}
	public double getP() {
		return p;
	}
	public void setP(double p) {
		this.p = p;
	}
	
	public Credit () {}
	
	public Credit(double kwotaKredytu, int czasSplaty, double p, double rata, double kwotaSplaty) {
		super();
		this.kwotaKredytu = kwotaKredytu;
		this.czasSplaty = czasSplaty;
		this.p = p;
		
	}

}
