import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> dic = new HashMap<String, String>();
		dic.put("baby", "�Ʊ�");
		dic.put("love", "���");
		dic.put("apple", "���");
		
		Set<String> keys = dic.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = dic.get(key);
			System.out.println( " [ " + key + " ] " + value );
		}
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.println( "ã����� �ܾ��?" );
			String eng = scanner.next();
			String kor = dic.get(eng);
			if(kor == null) System.out.println( "ã�� �ܾ �����ϴ�." );
			else System.out.println( kor );
	
		}
		
	}

}
