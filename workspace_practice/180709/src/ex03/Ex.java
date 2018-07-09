package ex03;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println( c1.toString() );
		System.out.println( c2.toString() );
		
		// String
		String s1 = "Hello";
		String s2 = "World";
		String s3 = "World";
		
		System.out.println( s1.charAt(3) );
		System.out.println( s2.equals( s3 ) );
		System.out.println( s3.indexOf('o') );
		System.out.println( (s1 + s2).length() );
		System.out.println( (s1 + " " + s3).replace("o", "¡Ý") );
		System.out.println( (s1 + " " + s3).split(" ") );
		System.out.println( (s1 + " " + s3).trim() );
		
		int ix = 300;
		System.out.println( ix );
		System.out.println( ix + "" );
		System.out.println( Integer.parseInt(ix + "" ) );
	}

}
