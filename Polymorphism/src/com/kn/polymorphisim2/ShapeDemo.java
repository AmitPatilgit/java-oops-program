package com.kn.polymorphisim2;



public class ShapeDemo {

	public static void main(String[] args) {
		
//		// create Parent Object
//		Shape sh;
//		//Create an Object Of geometry class
//      Geometry g = new Geometry();
//		//Create Child object Up-Casting to Parent Reference
//		sh=new Circle();
//		//Inherited method from Parent
//		sh.draw();
//		//Overridden method in Child Class
//		System.out.println(sh.calculateArea());
//		//Calling Child specific method using Down-Casting to Child reference
//		System.out.println("Perimeter of the Circle: " +((Circle)(sh) ).calculateCirclePerimeter());
		
		//System.out.println("=======================================================");
		
//		
//		//Create Child object Up-Casting to Parent Reference
//				sh=new Rectangle();
//				//Inherited method from Parent
//				sh.draw();
//				//Overridden method in Child Class
//				System.out.println(sh.calculateArea());
//				//Calling Child specific method using Down-Casting to Child reference
//				System.out.println("Perimeter of the Circle: " +((Rectangle)(sh) ).calculateRectPerimeter());
//				
//		//System.out.println("=======================================================");	
//				
//		//Create Child object Up-Casting to Parent Reference
//				sh=new Square();
//				//Inherited method from Parent
//				sh.draw();
//				//Overridden method in Child Class
//				System.out.println("Area of Square = " +sh.calculateArea());
//				//Calling Child specific method using Down-Casting to Child reference
//				System.out.println("Perimeter of the Circle: " +((Square)(sh) ).calSquarePerimetre());
//		
		//System.out.println("=======================================================");
		
		
//		Geometry g = new Geometry();
//		Rectangle r=new Rectangle();
//		g.doActivity(r);
//		System.out.println("=======================================================");
//		Square s=new Square();
//		g.doActivity(s);
//		System.out.println("=======================================================");
//		Circle c=new  Circle();
//		g.doActivity(c);
//		System.out.println("=======================================================");
		
		
		Geometry g = new Geometry();
		Rectangle r=new Rectangle();
		Square s=new Square();
		Circle c=new  Circle();
		g.doActivity(r);
		g.doActivity(s);
		g.doActivity(c);
	}

}
