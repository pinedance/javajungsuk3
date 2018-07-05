
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 생성자
		Car c1 = new Car();
		Car c2 = new Car(c1);
		Car c3 = new Car(c2);
		
		System.out.println( c1.color );
		System.out.println( c2.color );
		System.out.println( Car.count() );
		
		c3.del();
		System.out.println( Car.count() );
		
		// 맴버변수의 초기화 시기와 순서
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println( "p1의 제품번호: " + p1.serialNo );
		System.out.println( "p2의 제품번호: " + p2.serialNo );
		System.out.println( "p3의 제품번호: " + p3.serialNo );
		System.out.println( "생산된 제품의 수는: " + Product.count );
		
		// 클래스간의 관계셜정하기
		Deck d = new Deck();
		Card cc1 = d.pick();
		System.out.println( cc1.kind + "\t" + cc1.number );
		
		d.shuffle();
		Card cc2 = d.pick(55);
		System.out.println( cc2.kind + "\t" + cc2.number );
		
		// super
		Child c = new Child();
		c.method();
		
	}

}
