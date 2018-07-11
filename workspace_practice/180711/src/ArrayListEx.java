import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> str = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
			System.out.println("Enter username: ");
			String username = scanner.nextLine();
			str.add( username );
		}
		
		for(String q : str) {
			System.out.println( q );
		}
		
		int longestidx = 0;
		for(int j=0; j<str.size(); j++) {
			if( str.get(longestidx).length() < str.get(j).length() ) longestidx = j;
		}
		
		System.out.print( "The longest name is " );
		System.out.println( str.get(longestidx) );
	}

}
