import java.io.*;

public class FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader in = new InputStreamReader(System.in);
		
		FileWriter fout = null;
		String filename = "C:\\Users\\ITA\\eclipse-workspace\\javajungsuk3\\test.md";
		int c;
		try {
			fout = new FileWriter( filename );
			while( ( c=in.read() ) != -1 ) {
				fout.write( c );
			}
			in.close();
			fout.close();
		}
		catch( IOException e) {
			System.out.println( "입출력 오류" );
		}
	}

}
