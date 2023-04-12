package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayLsit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Name");
	
		ArrayList<String> str = new ArrayList<>();
				for (int i = 0; i <= 4; i++)
	         
		{
		   String b= sc.next();
			str.add(b);
		}
            
		System.out.println("My Arraylist"+ str);
		
	
//        
//		System.out.println("kya hatana h");
//		String c= sc.next();
//		str.remove(c);
//		System.out.println("Arraylist REMOVE method"+ str);
		
//		System.out.println("kya chahiye");
//		int c= sc.nextInt();
//		System.out.println("mil gaya ?"+str.get(c));

//		System.out.println("Size Bata ");
//		String d= sc.next();
 //		str.remove(d);
//		System.out.println(" Size Bata"+ str.size());
	
//		System.out.println("Replace Element");
//		int f=sc.nextInt();
//		str.set(f,"latika");
//		System.out.println("New String"+str);
		
//	System.out.println("Sort List");
//	   Collections.sort(str);
//	   System.out.println(str);
	
//		System.out.println("Sort reverse List");
//		   Collections.reverse(str);
//		   System.out.println(str);
		
		
//		str.clear();
//		System.out.println("Clear data"+str);
	
		
//		System.out.println("Is data in collection" +" " +str.isEmpty()+"  " + str.size());
		
	}
	     
       
	
}
