
public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 75;
		
		if(score >= 90) {
			System.out.println("A���");
		} else if(score >= 80 && score < 90) {	
			System.out.println("B���");
		} else if(score >= 70 && score < 80) {
			System.out.println("C���");
		} else {
			System.out.println("F���");
		}
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum +=1;
			System.out.println(sum);
		}
	}

}
