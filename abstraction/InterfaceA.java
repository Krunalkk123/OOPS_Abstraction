package abstraction;

public interface InterfaceA {

	public void meth1();
	
	default void meth2() {
		
		System.out.println(">>Every method inside is by default public abstract");
		this.meth4();
	}
	
	 static void meth3() {
		
		 System.out.println(">>we can write static methods inside Interface");
	}
	 
	 private void meth4() {
		 
		 System.out.println(">>We can write private method inside Interface");
	 }
	 
	 /*Interface(){
		 
		 System.out.println("We can't write Constructors inside Interface");
	 }*/
	 
	 public static void main(String[] args) {
		
		 System.out.println("We can write main method inside Interface");
		 
		 //InterfaceA obj=new InterfaceA(); // We can't create object for Interface. 
		                                    // because every method present in Interface is by default public abstract.
	}
}
