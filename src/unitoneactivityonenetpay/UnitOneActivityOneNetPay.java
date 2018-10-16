/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unitoneactivityonenetpay;

/**
 *Jacob Lacey
 *19 Sept 2018
 *To calculate the net pay of a worker including tax and insurance
 */
public class UnitOneActivityOneNetPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // double stores numbers
        double hours = 40.00;
        //per hour
        double wage = 5.00;
        //insurance costs
        double incost = 2.00;
        //22% is 0.22
        double tax = 0.22;
        //net pay
        double net = 0.00;
        
        //algorithm to find the net pay
        net =(hours*wage-incost)-tax*(hours*wage-incost);
        
        //print the answer
        System.out.println("The net pay for this worker would be "+net+".");
    }
    
}
