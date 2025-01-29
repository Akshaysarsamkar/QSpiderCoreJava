package filehanding;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataFronOneFileIntoAnother {

	public static void main(String[] args) throws IOException {


		String s = "";
		
		FileInputStream fis = new FileInputStream("c:\\FileHandling\\Song.txt");
		
		int read = fis.read();
		
		while(read != -1) {
			s= s + (char)read;
			read = fis.read();
		}
		
		fis.close();
		
		FileOutputStream fos = new FileOutputStream("c:\\FileHandling\\NewSong.txt");
		
		fos.write(s.getBytes());
		
		fos.close();
		
		

	}

}
