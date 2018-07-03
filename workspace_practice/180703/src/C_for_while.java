
public class C_for_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i;
//		int j;
		
		System.out.println( "## for ##" );
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println( i + " * " + j + " = " + i*j );
			}
		}
		
		System.out.println( "\n\n" );
		System.out.println( "## while ##" );
		
		int i=2;
		while(i<=9) {
			int j=1;
			while(j <=9) {
				System.out.println( i + " * " + j + " = " + i*j );
				j++;
			}
			i++;
		}
	}

}
