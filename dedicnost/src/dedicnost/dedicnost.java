package dedicnost;

public class dedicnost {

	public static void main(String[] args) {
	Admin pavel = new Admin(4);
	Admin tom = new Admin(10);
	Uzivatel petr = new Uzivatel();
	
	pavel.vypis("pavel", "novak", 33);
	
	pavel.hlaska();
	petr.hlaska();
	tom.hlaska();
	pavel.obj(pavel);
	petr.obj(petr);
	
	System.out.println(pavel);
	
	


	}

}
