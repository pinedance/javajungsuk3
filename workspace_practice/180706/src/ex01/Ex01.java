package ex01;

public class Ex01 {
	public static void main(String[] args) {
		
		// ���� �����ڸ� �̿��� ĸ��ȭ
		Time t = new Time(12, 90, 30);
		System.out.println( t );
		t.setHour( t.getHour() + 1 );
		System.out.println( t );
		
		// ������(polymorphism)
		Tv t1 = new Tv();
		CaptionTv c = new CaptionTv();
		Tv t2 = new CaptionTv();
		
		System.out.println( c.caption() );
//		System.out.println( t2.caption() );
		
		
	}
}
