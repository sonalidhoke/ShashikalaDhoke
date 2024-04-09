package CommonProgram;

public class throwsConcept {

	public static void main(String[] args) throws ArithmeticException {
		throwsConcept ob=new throwsConcept();
		ob.sum();
		

	}
public void sum() throws  ArithmeticException{
	div();
	
}
public void div() throws ArithmeticException  {
	int i=9/0;
}
}
