package samm;

import java.util.Arrays;

public class CharacterOccurence {

	public static void main(String[] args) {
		String str="vellakoil";
		int[] arr=new int[str.length()];
        
		char[] chararr=str.toCharArray();
		Arrays.sort(chararr);
		for(int i=0;i<str.length();i++) {
			arr[i]=1;
			for(int j=i+1;j<str.length();j++) {
			if(chararr[i] == chararr[j]) {
				arr[i]++;
			
			chararr[j]='0';
		}}
	}
		for(int  i=0;i<str.length();i++) {
			if(chararr[i]!='0') {
			System.out.println(chararr[i]+" "+arr[i]);
		}

}}}
