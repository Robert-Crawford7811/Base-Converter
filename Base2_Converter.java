/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rob
 */
import java.util.Scanner;

public class Base2_Converter {
        
        // data members
        private String binaryVal;
        private int decimalVal;
        
        // default constructor
        public Base2_Converter() {
                decimalVal = 0;
                binaryVal = new String();
        }
        
        // parameterized constructor
        public Base2_Converter(String binaryVal) {
                this.binaryVal = binaryVal;
        }
        
        // binary accessor
        public String getBinary() {
                return binaryVal;
        }
        
        // decimal accessor
        public int getDecimal() {
                return decimalVal;
        }
        
        // processing method
        public void convert() {
                for (int i = 0; i < binaryVal.length(); ++i) {
                        decimalVal += Math.pow(2, i) * binaryVal.charAt(binaryVal.length() - 1- i) % '0';
                }
        }
        
        // outputting method
        public void output() {
                System.out.println("The original string you entered was " + getBinary());
                System.out.println("The equivalent integer is " + getDecimal());
        }
        
        // input method
        public static String input() {
                
                Scanner sc = new Scanner(System.in);            
                String inp = sc.nextLine();
                int i;
                
                for (i = 0; i < inp.length(); ++i)
                        if (inp.charAt(i) != '0' && inp.charAt(i) != '1')
                                return null;
                
                sc.close();
                return inp;
        }

        // main method
        public static void main(String[] args) {
                
                // taking input from user
                String inp = input();
                
                // if empty string is returned means user has entered aninvalid string
                if (inp == null)
                        System.out.println("Error -- The string should consist of 1s and 0s only.");
                // else
                else {
                        Base2_Converter b = new Base2_Converter(inp);
                        b.convert();
                        b.output();
                }

        }

}