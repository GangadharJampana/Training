import java.io.*;
public class A {
	public void log() throws IOException{
		File f = new File("/home/prateekkr/abc.java");
		FileReader fr = new FileReader(f);
	}
	
	public static void main(String args[]){
		A a = new A();
		try {
			a.log();
		}	
		catch(FileNotFoundException ex) {
			System.out.println("File not Found!!");
		}
		catch(IOException ex) {
			System.out.println("This is handled in io catch block!!");
		}
		finally {
			System.out.println("This is in finally block!!");
		}
	}
}
