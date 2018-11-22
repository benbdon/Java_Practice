
public class Factorial
{
    /**
     * Calculate the non-negative power of an integer number. If a negative power is input, the method returns 1.
     * 
     * @param number The number to take power.
     * @param power The power factor to be taken to.
     * @return The calculation result after taking power of the integer number.
     */
    public static int fact2(int n1, int n2) {
        
    int t = 1; // initialize t to 1       
    for (int counter = n1; counter <= n2; counter++) {
        t = t * counter;
    }
    return t;
    }
}