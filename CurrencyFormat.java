//https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
package samm;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CurrencyFormat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		HashMap hashmap = new HashMap<>();
		double payment = scanner.nextDouble();

		hashmap.put("us", NumberFormat.getCurrencyInstance(Locale.US).format(payment));

		hashmap.put("INDIA", NumberFormat.getCurrencyInstance(new Locale("CH", "IN")).format(payment));

		hashmap.put("CHINA", NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));

		hashmap.put("FRANCE", NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));

		System.out.println(hashmap);

	}
}