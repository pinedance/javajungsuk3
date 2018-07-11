
class Point {
	
	int x, y;
	
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	
	public boolean equals(Point p) {
		if(x==p.x && y==p.y) return true;
		else return false;
	}
}

public class ObjectPropertyEx {
	public static void main(String[] args) {
		Point p = new Point(2,3);
		System.out.println( p.getClass().getName() );
		System.out.println( p.hashCode() );
		System.out.println( p.toString() );
		
		Point a = new Point( 2,3 );
		Point b = new Point( 2,3 );
		Point c = new Point( 3,4 );
		if( a==b) System.out.println( "a==b" );
		if( a.equals(b) ) System.out.println( "a is equal to b" );
		else System.out.println( "a is not equal to b" );
		if( a.equals(c) ) System.out.println( "a is equal to c" );
		else System.out.println( "a is not equal to b" );
		
		// String
		String java = "java";
		String cpp = "C++";
		int res = java.compareTo(cpp);
		if(res ==0) System.out.println( "the same" );
		else if(res < 0) System.out.println( java + " < " + cpp );
		else System.out.println( java + " > " + cpp );
		
		String d = " zxdfwe ";
		System.out.println( d.trim() );
		
		String s01 = new String(" C# ");
		String s02 = new String(" C++ ");
		System.out.println( s01.length() );
		System.out.println( s01.contains("#") );
		
		s01 = s01.concat( s02 );
		System.out.println( s01 );

		s01 = s01.trim();
		System.out.println( s01 );
		
		s01 = s01.replace("C#", "Java");
		System.out.println( s01 );
		
		String s[] = s01.split(",");
		for (int i=0; i<s.length; i++) 
			System.out.println( "분리된 문자열" + i + ": " + s[i] );
			
		
		
	}
}
