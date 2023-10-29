package com.kn.polymorphism3;

public class SoftwareDemo {

	public static void main(String[] args) {
		
		
// -------------------->Creating The different Reference Variable For each class		<---------------------------
//		SoftwareEngineer se = new SoftwareEngineer();
//		se.attendMeeting();
//		se.doTesting();
//		
//		System.out.println("--------------------------------------------------");
//		BackendEngineer be= new BackendEngineer();
		//overridden method
//		be.attendMeeting();
		//Inherited Method
//		be.doTesting();
		//Child Specific Method
//		be.doBackEndProject();
	
//		System.out.println("--------------------------------------------------");
//		
//		DatabaseEngineer de = new DatabaseEngineer();
		//overridden method
//		de.attendMeeting();
		//Inherited Method
//		de.doTesting();
		//Child Specific Method
//		de.doDatabaseProject();
		//Child Specific Method
//		de.learnSql();
//
//		System.out.println("--------------------------------------------------");

//		JavaBackendEnginner je= new JavaBackendEnginner();
		//overridden method
//		je.attendMeeting();
		//Inherited Method
//		je.doTesting();
		//Child Specific Method
//		je.doBackEndProject();
		//Child Specific Method
//		je.learnJava();
		
//		System.out.println("--------------------------------------------------");
		
//		PythonBackendEngineer pe = new PythonBackendEngineer();
		//overridden method
//		pe.attendMeeting();
		//Inherited Method
//		pe.doTesting();
		//Child Specific Method
//		pe.doBackEndProject();
		//Child Specific Method
//		pe.learnPython();
//		System.out.println("--------------------------------------------------");
	
		//---------------------------------->Ends****************************************<------------------------------------------------------
		
		
//---------------------------------->Creating the Parent Reference and pointing the OBject for the Parent Reference.<--------------------------------
//---------------------------------->And Also Create the doActivity Method and call in every class Object<--------------------------------
		
	//	SoftwareEngineer se = new SoftwareEngineer();
	//	doActivity(se);
		//System.out.println("--------------------------------------------------");
		
	//	se=new BackendEngineer();
	//	se.attendMeeting();
	//	se.doTesting();
	//	doActivity(se);
		//((BackendEngineer)se).doBackEndProject();
		
	//	System.out.println("--------------------------------------------------");
		
	//	se=new DatabaseEngineer();
//		se.attendMeeting();
//		se.doTesting();
	//	doActivity(se);
//		((DatabaseEngineer)se).doDatabaseProject();
//		((DatabaseEngineer)se).learnSql();
		
	//	System.out.println("--------------------------------------------------");
		
	//	se=new JavaBackendEnginner();
//		se.attendMeeting();
//		se.doTesting();
		//doActivity(se);
//		((JavaBackendEnginner)se).doBackEndProject();
//		((JavaBackendEnginner)se).learnJava();
		
	//	System.out.println("--------------------------------------------------");
		
		//se=new PythonBackendEngineer();
//		se.attendMeeting();
//		se.doTesting();
//		doActivity(se);
//		((PythonBackendEngineer)se).doBackEndProject();
//		((PythonBackendEngineer)se).learnPython();
		
	//	System.out.println("--------------------------------------------------");
		
		SoftwareEngineer se = new SoftwareEngineer();
		BackendEngineer be= new BackendEngineer();
		DatabaseEngineer de = new DatabaseEngineer();
		JavaBackendEnginner je= new JavaBackendEnginner();
		PythonBackendEngineer pe = new PythonBackendEngineer();
		
		doActivity(se);
		System.out.println("******************************************");
		doActivity(be);
		System.out.println("******************************************");
		doActivity(de);
		System.out.println("******************************************");
		doActivity(je);
		System.out.println("******************************************");
		doActivity(pe);
		System.out.println("******************************************");
		
		
		
		
	}
	
	
		public static void doActivity(SoftwareEngineer se)
		{
			se.attendMeeting();
			se.doTesting();
			
			
			if(se instanceof BackendEngineer)
			{
				((BackendEngineer)se).doBackEndProject();
			}
			else if(se instanceof DatabaseEngineer)
			{
				((DatabaseEngineer)se).doDatabaseProject();
				((DatabaseEngineer)se).learnSql();
			}
			else if(se instanceof JavaBackendEnginner)
			{
				((JavaBackendEnginner)se).doBackEndProject();
				((JavaBackendEnginner)se).learnJava();
			}
			else if(se instanceof PythonBackendEngineer)
			{
				((PythonBackendEngineer)se).doBackEndProject();
				((PythonBackendEngineer)se).learnPython();
			}
		}
		
		
		
	

	
}
