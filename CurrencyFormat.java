//https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
package samm;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CurrencyFormat {
    
    public static void main(String[] args) {
    	Scanner scanner =new Scanner(System.in);
    	
    	HashMap hashmap=new HashMap<>();
    	double payment = scanner.nextDouble();
        
      NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        
      hashmap.put(1,"us "+n.format(payment));
        
       NumberFormat n1 = NumberFormat.getCurrencyInstance(new Locale("CH", "IN"));
       hashmap.put(2,"INDIA"+n1.format(payment));
       
        NumberFormat n2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        hashmap.put(3,"CHINA"+n2.format(payment));
        
        NumberFormat n3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        hashmap.put(4,"FRANCE"+n3.format(payment));
        
        
         System.out.println(hashmap);
    	
    	
    
    }
}