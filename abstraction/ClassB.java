package abstraction;

public class ClassB extends ClassA{
	
	public void meth1()
	{
		System.out.println("Abstract method overridden");
	}

	public static void main(String[] args) {
		
		ClassA obj=new ClassB();
		obj.meth1();
		obj.meth3();
	}
}
