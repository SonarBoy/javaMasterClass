package com.concreteInheritance;

public class Demo {

	public static void main(String[] args) {
		
		Cruser x = new Cruser(165, 500, 90, "Bogo");
		Engine eng = new Engine("V-4", 330, 250);
		
		x.setMakeAndModel("Harley Davidson", "Rabit", eng);
		
		
		Racer y = new Racer(170, 600, 85, "Italy");
		eng = new Engine("V-3",550,300);
		
		y.setMakeAndModel("Ducati", "Sprinter", eng);
		
		System.out.println(x.description());
		System.out.println();
		System.out.println(y.description());
		System.out.println(y.getLicence());
		
		Garage<Cruser> cruserGarage = new Garage<Cruser>();
		
		
	}
	
	

}

