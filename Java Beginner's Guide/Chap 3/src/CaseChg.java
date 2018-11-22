/* This program changes case
 * of English letters and 
 * tracks total changes.
 */
public class CaseChg {
	public static void main(String args[])   
			throws java.io.IOException {
	    	
			char ch;
			int changes = 0;
			
			System.out.print("Enter period to stop."); 
			
			do {
				ch = (char) System.in.read(); 
				if(ch >= 'a' & ch <= 'z') {
					ch -= 32;
					System.out.println(ch);
					changes++;
				}
				else if(ch >= 'A' & ch <= 'Z') {
					ch += 32;
					System.out.println(ch);
					changes++;
				}
			} while (ch != '.');
			System.out.println("Case changes: " + changes);
	}
}