package com.concreteInheritance;

import java.util.Random;

public class Racer extends Bicycle implements IVehicle{
	
	protected String licence; 
	
	protected String manufacture;
	protected String model;
	protected String team;
	
	protected String tireBrand; 
	protected Engine engine;

	public Racer(double h, double w, double t, String team) {
		super(h, w, t);
		this.team = team;
		
		this.licence = this.getSaltString();
	}
	
	
	
	public double getHeight() {
		return super.height;
	}
	
	
	
	public void setMakeAndModel(String man, String mod, Engine eng) {
		this.manufacture = man;
		this.model = mod;
		this.engine = new Engine(eng.engineType + " Two-Stroke", eng.engineCapacity, eng.horsePower);
	}
	
	public String getManufacture() {
		return manufacture;
	}

	public String getModel() {
		return model;
	}

	public String description() {
		String desc = "";
		desc += "********************************* \n";
		desc += "Team: " + this.team + "\n";
		desc += "Manufacture: " + this.getManufacture() + " Model: " + this.model + " \n";
		desc += "Height: " + this.height + " Weight: " + this.weight + "\n";
		desc += "Engine: " + this.engine.engineType + "\n";
		desc += "*********************************";
		
		return desc;
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
