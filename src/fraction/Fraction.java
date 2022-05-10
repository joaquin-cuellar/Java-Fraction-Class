/* By Joaquin Cuellar for CSIS 1400 */
package fraction;
import java.lang.Math;

public class Fraction
{
    int n; //Numerator
    int d; //Denominator
        
    public Fraction() //Construct 1/1
    {
        n = 1;
        d = 1;
    }
    
    public Fraction(int nIn, int dIn) //Construct with custom inputs
    {
        n = nIn;
        d = dIn;
    }
    
    public String toString() //Return fraction as a string
    {
        int nOut = n;
        int dOut = d;
        
        if(dOut != Math.abs(dOut))
            nOut = nOut * -1;
        dOut = Math.abs(dOut);
        
        return nOut + "/" + dOut;
    }
    
    public double getDecimal() //Returns fraction as a decimal
    {
        double out = (double)n / d;
        return out;
    }
    
    public void reduce() //Mutates Fraction by reducing to lowest terms
    {
        //Attempts to reduce number using divisions of 2 through 19
        for(int i = 2; i <= 19; i++)
            while(n % i == 0 && d % i == 0)
            {
                n = n / i;
                d = d / i;
            }
    }
    
    public String toMixed() //Returns a whole number with reduced fraction as a string
    {
        int nOut = Math.abs(n);
        int dOut = Math.abs(d);
        int whole = n / d;
        //Take whole number out of fraction
        nOut = nOut - (dOut * Math.abs(whole));
        //Reduce fraction
        for(int i = 2; i <= 19; i++)
            while(nOut % i == 0 && dOut % i == 0)
            {
                nOut = nOut / i;
                dOut = dOut / i;
            }
        //Return
        return (whole != 0 ? (whole + " ") : "")
            + (nOut != 0 ? (nOut + "/" + dOut) : "");
    }
    
    
}
