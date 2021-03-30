/*31.Java program to display first 10 Fermat numbers.*/

/*This is usually taken to be the conjecture that every number of the form 2^2^n+1 is prime.  
So we call these the Fermat numbers, and when a number of this form is prime, we call it a Fermat prime.

The only known Fermat primes are the first five Fermat numbers: F0=3, F1=5, F2=17, F3=257, and F4=65537.
  A simple heuristic shows that it is likely that these are the only Fermat primes
   (though many folks like Eisenstein thought otherwise).*/

public class Fermat {

public static void main( String args[] ){ 
        int n = 0;        
        double result;

        while (n <= 10) {
            result= Math.pow (2, Math.pow(2, n)) + 1;
            n++;
            System.out.println (result);
        }
     }  
}