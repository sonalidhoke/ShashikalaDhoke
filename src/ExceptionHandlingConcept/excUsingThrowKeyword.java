package ExceptionHandlingConcept;

public class excUsingThrowKeyword {

	public static void main(String[] args)  {
		
		System.out.println("sonali");
		try {
			
		
		throw new Exception("Sonali Exception");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Dhoke");

	}

}
