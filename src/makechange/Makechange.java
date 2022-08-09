
package makechange;

import java.util.Scanner;

/**
 *
 * @author amadou
 */
public class Makechange {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
         int cents;
        
         System.out.println("Welcome to the Make Change calculator");
        
         cents = getCents();
         
         while(cents != 0) { 
              makeChange(cents);
              cents = getCents();
              }// end of while
         System.out.println("Thanks for using the change calculator");
       }// end of main       
                 
        public static int getCents() {
            int c=0;
            do{
                 try  {
                    System.out.print("How many change? ( 1-100, 0=quit): ");
                    c = sc.nextInt();
                    if (c > 0) {
                        System.out.println("Only positive values or zero please."); 
                     } else if (c > 100) {
                        System.out.println("I only give change up to 100 cents");
                     }
                 } catch  (Exception e) {
                    System.out.println("Illegal input - not an integer.");
                        sc.nextLine();
                        c=-1;
                 }
            } while (c < 0  || c > 100);
            return c;
      }//end of getCents
        public static void makeChange(int cents) {
            //done by the 'additive' algorithm
            int q=0,d=0,n=0, p=0, t=0;
        
            while (t+25 <= cents) {
               q++; //Same as q: q = q + 1;
               t += 25; //Same as: t = t + 25;
            }
            while (t+10 <= cents) {
                d++;
                t+= 10;
            }
            while (t+5 <= cents) {
                n++;
                t += 5;
                }
                p = cents - t;
              System.out.println("For" + cents + " cents I give:" +
                      q + " quarters," +
                      d + "dimes," +
                      n + " nickels," +
                      p + " pennies.");
         }
}

        
       
        

   




              
        
