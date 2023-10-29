package com.kn.abstraction;

 abstract public class Car {

	public void start()
	{
		System.out.println("Car has been started.");
	}
	public void stop()
	{
		System.out.println("Car has been stoped");
	}
	abstract public void refuel();
}
