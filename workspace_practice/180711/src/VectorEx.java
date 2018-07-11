import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		
		v.add(2,100);
		System.out.println("Size: "+ v.size() );
		System.out.println("Capa: "+ v.capacity() );
		
		for(int i : v) {
			System.out.println( i );
		}
		
		int sum = 0;
		for(int i : v) {
			sum += i;
		}		
		System.out.println( sum );
		
	}

}
