package dedicnost;



public class Admin extends Uzivatel {
	protected int i;
	public Admin(int i) {
		
		this.i = i;
	}

	@Override
	protected void hlaska() {
		System.out.println("Metoda hlaska v tride Admin");
		
		if (i > 5) {
			super.hlaska();
			
		}
	
		
	}
	
	
		
		
	}
	

		
		
	
	
