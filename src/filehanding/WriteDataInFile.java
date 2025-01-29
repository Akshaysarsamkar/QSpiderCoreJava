package filehanding;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataInFile {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("c:\\FileHandling\\SuniyaSong.txt");

			String string = "Suniya suniya Rata de Rata De Vich Tu";

			fos.write(string.getBytes());

			System.out.println("Data Entered Successfully!!!!!!!!!");

			fos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
