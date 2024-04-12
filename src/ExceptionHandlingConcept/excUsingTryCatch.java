package ExceptionHandlingConcept;

public class excUsingTryCatch {

	public static void main(String[] args) {
		
		try {
			int i=9/0;
			
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("sssss");

	}

}
