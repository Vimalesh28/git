package samm;

import java.util.HashMap;

public class Insertion{
	
public  static void main(String[] args){
	HashMap<Integer,String> hashmap=new HashMap<>();
	hashmap.put(9, "vimalesh");
	hashmap.put(19, "vimal");
	int key=9;
	hashmap.remove(key);
	System.out.print(hashmap);
	
		
	
}}