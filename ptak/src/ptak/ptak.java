package ptak;

public class ptak {

protected int hlad = 100;
protected int vaha = 50;

public void snez(int a) {
	vaha += a;
	hlad -= a;	
}


@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Jsem pták s váhou %d a hladem %d.", vaha,hlad);
	}

}
