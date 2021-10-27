package easy;

import java.util.ArrayList;
import java.util.List;

public class BillSplit 
{
	 public static void bonAppetit(List<Integer> bill, int k, int b) 
	 {
	    // Write your code here
		 int total=0;
		 int total1=0;
		 for(int i=0;i<bill.size();i++) 
		 {
			 if(i==k)
			 {
				 continue;
			 }
			 total+=bill.get(i);
		 }
		 
		 total1= ((total + bill.get(k))/2)-(total/2);
		  	 
		 if(total/2 == b) {
			 System.out.println("Bon Appetit");
		 }
		 else {
			 System.out.println(total1);
		 }
	 }
	 
	 public static void main(String[] args) 
	 {
		 BillSplit b1 = new BillSplit();
		 List<Integer> bill = new ArrayList<>();
			bill.add(3); 
			bill.add(10); 
			bill.add(2); 
			bill.add(9); 
		int k=1;
		int b=12;
		
		b1.bonAppetit(bill, k, b);
		
	 }

}
