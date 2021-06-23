package filestreamsex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamsEx {

	public static void main(String[] args) throws IOException {
		
		File file1 = new File("C:/Users/RAJU CHELLE/Desktop/File1.txt");
		FileInputStream fis = new FileInputStream(file1);
		
		System.out.println(fis.available());
		byte b1[] = new byte[fis.available()];
		fis.read(b1);
		
		System.out.println(new String(b1));
//		System.out.println(new String(fis.read(new byte[5])));
		
		FileOutputStream fos = new FileOutputStream(file1);
		
		String str = "Hello HCL";
		
		byte[] b2 = str.getBytes();
		
		fos.write(b2);
		
	}

}
