/*
 * Angus Henry
 * NetPay.Java
 * This program finds the net pay for a worker
 * 27 Feb 2018
 */

package netpay;

/**
 *
 * @author anhen3335
 */
public class NetPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n = 0;
        double h = 40;
        double w = 5;
        double i = 2;
        double t = 0.22;
        n = (h*w-i)- t *(h*w-i);
        System.out.println ("The net pay for this employee is " + n +  " $");
    }
    
   
}
