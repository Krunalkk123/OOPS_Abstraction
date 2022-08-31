package abstraction;
//Abstraction is the process of hiding the implementation details from 
// the user and showing only necessary details to the user.
public  abstract class ClassA {

	abstract void meth1();
	
	public void meth2() {
		
		System.out.println("meth2 called");
	}
	
	 ClassA(){
		
		System.out.println("ClassA Constructor");
	}
	
	static void meth3() {
		
		System.out.println("static meth3 called");
	}
	public static void main(String[] kk) {
		
		System.out.println("ClassA main method");
		 ClassA.meth3();
	}
	
}
