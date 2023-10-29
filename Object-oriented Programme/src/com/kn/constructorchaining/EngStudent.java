package com.kn.constructorchaining;

public class EngStudent extends Student {
	
	String branch;
	int sem;


	

	public EngStudent(String name,int age,String branch, int sem ) 
	{
		super(name,age);
		System.out.println("*-----Before----");
		System.out.println("Name = "+super.name );
		System.out.println("Age = " +super.age);
		System.out.println("Sem = " +this.sem);
		System.out.println("Branch = " +this.branch);
		this.name=name;
		this.age=age;
		this.branch = branch;
		this.sem = sem;
		
		System.out.println("*-----After----");
		System.out.println("Name = "+super.name );
		System.out.println("Age = " +super.age);
		System.out.println("Sem = " +this.sem);
		System.out.println("Branch = " +this.branch);
	}

	public EngStudent(String name , int age, int sem)
	{
		super(age);
		System.out.println("*-----Before----");
		System.out.println("Name = "+super.name );
		System.out.println("Age = " +super.age);
		System.out.println("Sem = " +this.sem);
		System.out.println("Branch = " +this.branch);
		this.name=name;
		this.age=age;
		this.sem=sem;
		System.out.println("*-----After----");
		System.out.println("Name = "+super.name );
		System.out.println("Age = " +super.age);
		System.out.println("Sem = " +this.sem);
		System.out.println("Branch = " +this.branch);
		
	}
	public EngStudent(String name , int age, String branch)
	{
		super(name);
		System.out.println("*-----Before----");
		System.out.println("Name = "+super.name );
		System.out.println("Age = " +super.age);
		System.out.println("Sem = " +this.sem);
		System.out.println("Branch = " +this.branch);
		this.name=name;
		this.age=age;
		this.branch=branch;
		System.out.println("*-----After----");
		System.out.println("Name = "+super.name );
		System.out.println("Age = " +super.age);
		System.out.println("Sem = " +this.sem);
		System.out.println("Branch = " +this.branch);
		
	}
	public EngStudent(String name ,int age)
	{
		super(name,age);
		System.out.println("*-----Before----");
		System.out.println("Name = "+super.name );
		System.out.println("Age = " +super.age);
		System.out.println("Sem = " +this.sem);
		System.out.println("Branch = " +this.branch);
		
		this.name=name;
		this.age=age;
		
		System.out.println("*-----After----");
		System.out.println("Name = "+super.name );
		System.out.println("Age = " +super.age);
		System.out.println("Sem = " +this.sem);
		System.out.println("Branch = " +this.branch);
		
	}
	public EngStudent(int sem,String branch)
	{
		super();
		System.out.println("*-----Before----");
		System.out.println("Name = "+super.name );
		System.out.println("Age = " +super.age);
		System.out.println("Sem = " +this.sem);
		System.out.println("Branch = " +this.branch);
		this.sem=sem;
		this.branch=branch;
		System.out.println("*-----After----");
		System.out.println("Name = "+super.name );
		System.out.println("Age = " +super.age);
		System.out.println("Sem = " +this.sem);
		System.out.println("Branch = " +this.branch);
	}
	
	
	
	
	
	
}

	
