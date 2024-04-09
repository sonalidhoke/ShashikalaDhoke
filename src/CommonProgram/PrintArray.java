package CommonProgram;

public class PrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String  array[]= { "1 2 4 1 3 6 7 5 2 6 1"};
		
		int count=0;
		for(int i=0; i<array.length;i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i].equals(array[j]))
					count++;
					System.out.println(array +":"+ count);
					
					
				}
				
			}
		
		
	       }
		//System.out.print(count);
	}

}
