package CommonProgram;

public class trycatchConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		try {
			
			int sum=20/0;
			System.out.println("addition of two number is" +sum);
		}
		
		catch(ArithmeticException e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		finally {
			
			System.out.println("finally  is always executed-------");
		}
	

	}

}
