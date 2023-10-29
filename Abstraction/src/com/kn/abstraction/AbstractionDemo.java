package com.kn.abstraction;

public class AbstractionDemo {

	public static void main(String[] args) {

		ElectricCar ec =new ElectricCar();
		PetrolCar pc = new PetrolCar();
		DesielCar dc= new DesielCar();
		
		ec.start();
		ec.stop();
		ec.refuel();
		System.out.println("----------------------------------------");

		
		pc.start();
		pc.stop();
		pc.refuel();
		System.out.println("----------------------------------------");

		dc.start();
		dc.stop();
		dc.refuel();
		System.out.println("----------------------------------------");

		
	}

}
