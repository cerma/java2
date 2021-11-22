package dedicnost;

public class Uzivatel {
	
protected String jmeno;
protected String prijmeni;
protected int vek;

protected void vypis(String jmeno,String prijmeni,int vek) {
	this.vek = vek;
	this.jmeno = jmeno;
	this.prijmeni = prijmeni;
	
	System.out.printf("jmeno: %s prijmeni: %s, vek: %d", jmeno,prijmeni,vek);
}



}
