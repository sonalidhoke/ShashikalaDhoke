package ExceptionHandlingConcept;

public class excUsingThrows {

	public static void main(String[] args) {
		
		excUsingThrows obj=new excUsingThrows();
		obj.sum();
		System.out.println("ABC");
		

	}
	public void sum()  {
	try {	
		div();
	}
	catch(ArithmeticException e) {
		e.printStackTrace();
	}
	}
	public void div()  throws ArithmeticException{
		int i=9/0; //exception line
	}
	}
	


