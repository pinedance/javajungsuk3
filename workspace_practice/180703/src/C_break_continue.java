
public class C_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Loop1: for(int i=2; i<9; i++) {
			
			for(int j=1; j<=9; j++) {
			
				if(j==5) { 
					break Loop1;
				} else {
					System.out.println(i + " * " + j + " = " + i*j );
				}
				
			} // end of for i
				System.out.println();
		
		} // end of Loop1
	}

}
