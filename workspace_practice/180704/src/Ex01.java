
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Use TV class		
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println( t.channel );
		
		
		// Use MyMath class

		MyMath mm = new MyMath();
		System.out.println(  mm.add( 1L, 2L ) );
		System.out.println( MyMath.addstatic( 1L,  2L) );

		System.out.println(  mm.factorial(7)  );
		System.out.println( MyMath.factorialstatic( 7) );
		
		// method overloading
		System.out.println(  mm.add( 1L, 2L ) );
		System.out.println(  mm.add( 1, 2 ) );
		int[] arr = {1,2,3,4,5, 6, 7, 8, 9, 10};
		System.out.println(  mm.add( arr ) );
		
	}

}

