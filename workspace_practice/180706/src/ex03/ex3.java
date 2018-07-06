package ex03;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 접근 제어자를 이용한 캡슐화
		Time t = new Time(12, 90, 30);
		System.out.println( t );
		t.setHour( t.getHour() + 1 );
		System.out.println( t );
	}

}
