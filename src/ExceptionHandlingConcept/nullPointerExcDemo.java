package ExceptionHandlingConcept;

public class nullPointerExcDemo {
	
	int a=10;

	public static void main(String[] args) {
		
		nullPointerExcDemo obj= new nullPointerExcDemo();
		obj=null;
		System.out.println(obj.a);
		

	}

}
