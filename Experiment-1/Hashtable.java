package exp1;
import java.util.*;
public class Hashtable {
	 public static void main(String args[]){  
		  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  hm.put(1250,"sowjanya");  
		  hm.put(1251,"nitya");  
		  hm.put(1252,"harshini");  
		  hm.put(1253,"sai");  
		  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
	}  	
}
