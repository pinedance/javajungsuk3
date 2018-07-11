import app.GoodCalc;
import lib.Calculator;

public class CalcMain {

	public static void main(String[] args) {
		
		Calculator c = new GoodCalc();
		System.out.println( c.add(2, 3) );
		System.out.println( c.subtract(2, 3) );
		int[] t = {2,3,4};
//		System.out.println( c.average(new int[] [2,3,4] ) );
		System.out.println( c.average( t ) );
		

	}

}
