package ex01;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Try Catch 1.5
		try {
			Exception e = new Exception("고의로 발생시켰음.");
			throw e; //예외를 발생시킴
		} catch (Exception e) {
			System.out.println("에러 메시지: " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("프로그램이 정상 종료되었습니다.");
		
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
				System.out.println("예외메시지: " + ae.getMessage());
		} catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println(6);
	}

}
