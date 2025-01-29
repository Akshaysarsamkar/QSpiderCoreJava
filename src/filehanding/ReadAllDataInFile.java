package filehanding;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadAllDataInFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		FileInputStream fis = new FileInputStream("c:\\FileHandling\\Song.txt");

		int r = fis.read();

		while (r != -1) {

			System.out.print((char) r);
			r = fis.read();
		}
		System.out.println();
		System.out.println(fis.getChannel());
		System.out.println(fis.getFD());
		fis.close();

	}

}
