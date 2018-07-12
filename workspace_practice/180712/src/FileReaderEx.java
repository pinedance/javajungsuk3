import java.io.*;

public class FileReaderEx {

	public static void main(String[] args) {
		FileReader in = null;
		String filename = "C:\\Users\\ITA\\eclipse-workspace\\javajungsuk3\\readme.md";
		try {
			in = new FileReader( filename );
			int c;
			while( ( c=in.read() ) != -1 ) {
				System.out.print( (char)c );
			}
			in.close();
		}
		catch( IOException e) {
			System.out.println( "입출력 오류" );
		}
	}
	
}
