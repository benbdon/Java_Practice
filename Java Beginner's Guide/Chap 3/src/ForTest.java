// Loop until an S is typed. 
class ForTest {   
  public static void main(String args[])   
    throws java.io.IOException { 
	  
	char read;
    int i; 
 
    System.out.println("Press S to stop."); 
 
    for(i = 0; (read = (char) System.in.read()) != 'S'; i++){ 
    	System.out.print("Pass #" + i);
    
 // 	specific checks for LF \n, or CR \r
    	if (read == '\n')
    		System.out.println("; char read was: \\n");
    	else if (read == '\r')
    		System.out.println("; char read was: \\r");
    	else System.out.println("; char read was: " + read);
    }
  }   
}