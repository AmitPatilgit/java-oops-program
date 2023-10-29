package com.kn.abstraction2;

public class ProgramDemo {

	public static void main(String[] args) {
//		Progam2  p2 = new Progam2();
//		p2.m1();
		Program.m1();
		Program p1=new Progam2();
		p1.m1();
		p1.m2();
		p1.m3();
		p1.m4();
		String[] sr= {"a","s"};
		Program.main(sr);
	}

}
