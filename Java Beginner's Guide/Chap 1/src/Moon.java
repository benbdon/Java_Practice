/*  
   Try This 1-1 
 
   This program converts earth weight to moon weight. 
 
   Call this program Moon.java. 
*/  
class Moon {  
  public static void main(String args[]) {  
    double earthWeight; // holds the earth weight 
    double moonWeight;  // holds conversion to moon weight 
 
    earthWeight = 170;
 
    moonWeight = earthWeight * .17; // convert to liters 
 
    System.out.println(earthWeight + " pounds on earth is " + moonWeight + " pounds on the moon."); 
  }  
}