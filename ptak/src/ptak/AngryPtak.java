package ptak;

public class AngryPtak extends ptak {
	
	protected int vztek = 50;
	
	public void provokuj(int a) {
		
		if (hlad > 99) {
			vztek = vztek + (2*a);
			
		}
		else 
			vztek += a;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Jsem angry-pták s váhou %d a hladem %d, míra mého vzteku je %d.", vaha,hlad,vztek);
	}
	

}
