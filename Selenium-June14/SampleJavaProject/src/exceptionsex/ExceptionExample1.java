package exceptionsex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExample1 {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		int c = 300;
		
		int a =100;
		
		int b = 0;	
		
		try{
			System.out.println(a/b);			
		}catch(Exception ariEx){
			System.out.println(ariEx.getMessage());
			
			System.out.println(a/1);
		}
		
		System.out.println("Successfull");
		
		System.out.println(a/5);
		
		
		Thread.sleep(10000);
		
		FileInputStream fis = new FileInputStream(new File("C://file.txt"));

	}

}
