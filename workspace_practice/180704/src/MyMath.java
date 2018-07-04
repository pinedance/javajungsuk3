
public class MyMath {
	
	// instance method, class method
	long add( long a, long b ) {
		long result = a + b;
		return result;
	}
	
	static long addstatic( long a, long b ) {
		long result = a + b;
		return result;
	}
	
	// recursive method
	long factorial( int n) {
		long result = 0;
		
		if(n == 1) {
			result = 1;
		} else {
			result = n * factorial(n-1);
		}
		
		return result;
	}
	
	static long factorialstatic( int n) {
		long result = 0;
		
		if(n == 1) {
			result = 1;
		} else {
			result = n * factorialstatic(n-1);
		}
		
		return result;
	}
	
	// method overloading
	int add(int a, int b) { return a+b; }
	int add(int[] a) {
		int result = 0;
		
		for(int i=0; i< a.length; i++) {
			result += a[i];
		}
		
		return result;
	}
	
	
}
