import java.io.*;
class Test 
{

	public static void main(String[] args) {
		
		File f = new File("hari\\singh\\thakur");
		boolean b =f.delete();			// it only delete directory when it is empty
		System.out.println(b);
		
		if (b) {
			System.out.println("directory deleted");
		}
		else
			System.out.println("directory not present");
	}
	
}
