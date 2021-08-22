package com.concreteInheritance;

public class Cruser extends Bicycle implements IVehicle{
	
	protected String licence; 
	
	protected String manufacture;
	protected String model;
	
	protected String tireBrand; 
	protected PistonEngine engine;
	
	public Cruser(double h, double w, double t, String tb) {
		super(h, w, t);
		tireBrand = tb;
		
		this.licence = getSaltString();
	}
	
	
	public double getHeight() {
		return super.height;
	}
	
	public void setMakeAndModel(String man, String mod, Engine eng) {
		this.manufacture = man;
		this.model = mod;
		this.engine = new PistonEngine(eng.engineType, eng.engineCapacity, eng.horsePower);
	}
	
	
	public void setEngine(PistonEngine pe){
		this.engine = pe;
	}
	
	public String description() {
		String desc = "";
		desc += "-------------------------------- \n";
		desc += "Manufacture: " + this.getManufacture() + " Model: " + this.model + " \n";
		desc += "Height: " + this.height + " Weight: " + this.weight + "\n";
		desc += "Engine: " + this.engine.engineType + "\n";
		desc += "--------------------------------";
		
		return desc;
	}
	
	public String getManufacture() {
		return manufacture;
	}


	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}
	
	private class PistonEngine extends Engine{

		public PistonEngine(String eT, double eC, int hP) {
			super(eT, eC, hP);
		}
		
		
		
	}

	@Override
	public String getLicence() {
		// TODO Auto-generated method stub
		return this.licence;
	}

	@Override
	public String getRegistration() {
		// TODO Auto-generated method stub
		return this.licence + " \n" + this.description();
	}

}
