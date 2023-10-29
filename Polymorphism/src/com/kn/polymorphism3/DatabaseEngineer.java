package com.kn.polymorphism3;

public class DatabaseEngineer extends SoftwareEngineer {

	@Override
	public void attendMeeting() {
		System.out.println("Database Engineer is Attending the Meeting.");
	}
	public void doDatabaseProject()
	{
		System.out.println("Database Engineer is Working on Databse Project.");
	}
	public void learnSql()
	{
		System.out.println("Database Engineer is Learning SQL.");
	}

	
}
