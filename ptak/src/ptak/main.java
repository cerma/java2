package ptak;

public class main {

	public static void main(String[] args) {
	
		ptak vlastovka = new ptak();
		System.out.println(vlastovka);
		vlastovka.snez(20);
		System.out.println(vlastovka);
		
		AngryPtak angry = new AngryPtak();
		System.out.println(angry);
		angry.provokuj(5);
		System.out.println(angry);
		angry.snez(100);
		angry.provokuj(5);
		System.out.println(angry);

	}

}
