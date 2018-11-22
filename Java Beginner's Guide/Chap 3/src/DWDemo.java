// Demonstrate the do-while loop. 
class DWDemo {   
  public static void main(String args[])   
    throws java.io.IOException { 
 
    char ch; 
 
    do { 
      System.out.print("Press a key following by ENTER: "); 
      ch = (char) System.in.read(); // get a char 
    } while(ch != 'q'); 
    System.out.print("Congrats! Hope you didn't cheat. If you did, at least that means you know how to read code effectively.");
  }   
}