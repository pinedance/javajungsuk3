
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ������
		Car c1 = new Car();
		Car c2 = new Car(c1);
		Car c3 = new Car(c2);
		
		System.out.println( c1.color );
		System.out.println( c2.color );
		System.out.println( Car.count() );
		
		c3.del();
		System.out.println( Car.count() );
		
		// �ɹ������� �ʱ�ȭ �ñ�� ����
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println( "p1�� ��ǰ��ȣ: " + p1.serialNo );
		System.out.println( "p2�� ��ǰ��ȣ: " + p2.serialNo );
		System.out.println( "p3�� ��ǰ��ȣ: " + p3.serialNo );
		System.out.println( "����� ��ǰ�� ����: " + Product.count );
		
		// Ŭ�������� ��������ϱ�
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
