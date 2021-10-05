
//int interface
//data members: static public and final
//methods: public and abstarct
//interface supports multiple inheritance because no ambiguity occurs
//interface provides 100% abstraction
//interface->interface :extends
//interface->class: implements

interface IPOINT{
	void points();//static and public and final
}

abstract class SHAPE {
	abstract void display();//has to be overriden
}

class TRIANGLE extends SHAPE implements IPOINT{
	
	void display()
	{
		System.out.println("\n Displaying class Triangle");
	}
	public void points() 
	{
		System.out.println("Triangle has three points");
	}
	
	
}

class CIRCLE extends SHAPE {
	void display()
	{
		System.out.println("\n Displaying class Circle");
	}
}

class THREE_D_CIRCLE extends CIRCLE {
	void display() {
		System.out.println("\n Displaying class 3D circle");
	}
}
class HEXAGON extends SHAPE implements IPOINT{
	void display() 
	{
		System.out.println("\n Displaying class Hexagon");
	}
	public void points() 
	{
		System.out.println("Hexagon has six points");
	}
}


public class shapedriver {

	public static void main(String[] args){
		TRIANGLE T1 = new TRIANGLE();
		T1.display();
		IPOINT i1 = new TRIANGLE();
		i1.points();
		CIRCLE C1= new CIRCLE();
		C1.display();
		THREE_D_CIRCLE TD1= new THREE_D_CIRCLE();
		TD1.display();

		IPOINT i2 = new HEXAGON();
		i2.points();
		
	}

}