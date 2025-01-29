package filehanding;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

// Read the first Character in the File And check Total Byte Data 
public class InputStreamMethod {

	public static void main(String[] args) throws IOException {

		InputStream is = new FileInputStream("c:\\FileHandling\\Song.txt");

		System.out.println(is.available());

		int data = is.read();

		System.out.println((char) data);

		System.out.println(is.available());

		is.close();
	}

}
