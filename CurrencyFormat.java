//https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
package samm;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;

class CurrencyFormat {
    private static final String US="Us";
    private static final String INDIA="India";
    private static final String CHINA="China";
    private static final String FRANCE="France";//the value are not change so we can declare as static and the value are static
    private static final HashMap<String,Locale> LOCALE_MAP=new HashMap<>();
    
    static {
    	LOCALE_MAP.put(US,Locale.US);
    	LOCALE_MAP.put(INDIA,new Locale( "ch","IND"));
    	LOCALE_MAP.put(CHINA,Locale.CHINA);
    	LOCALE_MAP.put(FRANCE,Locale.FRANCE);//In the hashmap both key and value will be added...
    }
    private static void printcurrency(final String countryName,final double payment)throws  IllegalArgumentException{
    	Locale locale=LOCALE_MAP.get(countryName);//in the locale variable the hashmap.get is used to check by give the key  wheather the it will be present or not. 
    	if(locale == null) {//if the countryname is invalid (that means LOCALE_MAP key and the countryname are not same it will store null) 
    		throw new IllegalArgumentException ("unsupport country"+ countryName);//LOCALE_MAP key and the countryname are not same it will print
    	}
    	String formatCurrency=NumberFormat.getCurrencyInstance(locale).format(payment);//both LOCALE_MAP key and the countryname are  same it will change the payment to respective cuurency
    	System.out.println(countryName+" "+formatCurrency);//print the countryname and the and changed the formatCurrency
    }
    public static void main(String[] args) {
    	String[] countries= {US,INDIA,CHINA,FRANCE};//initialize the string array with countryname
    	double payment=0;//initialize the money in the double using payment varaible
    	for(String countryName:countries) {//using for each loop initialize the countries array to countryName 
    		try {//check the countryName is not empty 
    			printcurrency(countryName,payment);//calling the method by the parameter (countryName,payment)
    		}
    		catch(IllegalArgumentException e) {//it will be empty print the mess....
    			System.out.println(e.getMessage());//print the it will be empty
    		}
    	}
    	
    }}	 