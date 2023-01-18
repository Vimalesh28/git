package hackerrank;

import java.util.Scanner;

public class Occurence {
public static void main(String[] args) {
	String input="gopiFMmM";
	String str=input.toLowerCase();
	
	int[] count=new int[122];
	for(int i=0;i<str.length();i++)
{
		count[(int)str.charAt(i)]++;
		}
	for(int i=0;i<122;i++) {
		if(count[i]!=0)
		System.out.println((char) i+" "+count[i]);
	}
	}
}