import java.io.*;
public class FileWriterDemo{ 

	
	public static void main (String[] args){ 
		FileWriter  pw = null;
		
		try {
		pw = new FileWriter("test.txt");
		pw.write("Hello World");
		
		} 
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		finally {
			pw.close();
		}
		
	}
	
}