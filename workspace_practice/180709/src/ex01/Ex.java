package ex01;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Try Catch 1.5
		try {
			Exception e = new Exception("���Ƿ� �߻�������.");
			throw e; //���ܸ� �߻���Ŵ
		} catch (Exception e) {
			System.out.println("���� �޽���: " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("���α׷��� ���� ����Ǿ����ϴ�.");
		
		// Try Catch 1.7
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch(ArithmeticException ae) {
			if (ae instanceof ArithmeticException)
				System.out.println("true");
				ae.printStackTrace();
				System.out.println("���ܸ޽���: " + ae.getMessage());
		} catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println(6);
	}

}
