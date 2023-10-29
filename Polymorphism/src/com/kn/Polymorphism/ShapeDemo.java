package com.kn.Polymorphism;

public class ShapeDemo {

	public static void main(String[] args) {
		
	//	Shape sh= new Shape();
		
		Rectangle r= new Rectangle();
//		sh=r;
//		sh.draw();
//		System.out.println(sh.calculateArea());
		
		Square s=new Square();
//		sh=s;
//		sh.draw();
//		System.out.println(sh.calculateArea());
		
		Circle c= new Circle();
//		sh=c;
//		sh.draw();
//		System.out.println(sh.calculateArea());
		Geometry g= new Geometry();
		g.doActivity(r);
		g.doActivity(s);
		g.doActivity(c);

	}

}
