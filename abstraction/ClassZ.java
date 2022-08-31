package abstraction;

public  class ClassZ extends ClassX implements InterfaceA, InterfaceB {

	public void meth1() {
		
		System.out.println("InterfaceA abstract meth1() method Overridden");
	}
	public void show() {
		
		System.out.println("InterfaceB abstract show() method Overridden");
		
	}
	void display()
	{
		System.out.println("ClassZ normal method called");
	}
	
	public static void main(String[] args) {
		
		InterfaceA aobj=new ClassZ(); // we can create reference for Interface but we can't create object for Interface.
		aobj.meth1(); // InterfaceA called
		aobj.meth2(); 
		InterfaceA.meth3(); // calling static method of InterfaceA
		System.out.println("-----------------------------------");
		InterfaceB bobj=new ClassZ();
		bobj.show();
		System.out.println("----------------------------------");
		ClassZ z=new ClassZ();
		z.display(); // ClassZ normal method called.
		
	}
}
