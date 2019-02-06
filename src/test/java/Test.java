
public class Test {

	public static void main(String[] args) {
		       MyClass m= new MyClass1();
		       m.some();
		    
	}
	
	    

}
 class MyClass {
    /*public void some(){
  System.out.println("super");
  }*/
}

 class MyClass1 extends MyClass {
  public void some(){
  System.out.println("sub");
  }
}