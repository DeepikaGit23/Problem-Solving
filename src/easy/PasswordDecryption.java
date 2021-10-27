package easy;

import java.util.Stack;

public class PasswordDecryption {

	public static String decryptPassword(String s) {
	    // Write your code here
	        Stack<Character> stack =new Stack<Character>();
	        String res= "";
	        for(int i=0;i<s.length();i++)
	        {
	            if(s.charAt(i)>48 &&s.charAt(i)<=57)
	            {
	                stack.push(s.charAt(i));
	            }
	            
	        }
	 	
	        int k=0;
	        while(k<s.length())
	        {
	        	char temp='\0';
	        	if(s.charAt(k)==48) 
	        	{
	        		res+=stack.pop();
	        		System.out.println("K after 2nd if" + k);
	        		k++;	
	        	}
	        	else  if(((s.charAt(k)>48 && s.charAt(k)<=57)) || s.charAt(k)==42)  
	        	{
	        		System.out.println("after 1st if" + s.charAt(k));
	        		k++;
	        	}
	        	
	        	else if(s.charAt(k+1)>=65 && s.charAt(k+1)<=90)
	        	{
	        		char b=s.charAt(k+1);
	        		char a=s.charAt(k);
	        		temp=a;
	        		a=b;
	        		b=temp;
	        		res+=a;
	        		res+=b;
	        		k++;
	        	}
	      
	        	
	        	
	        }
	        return res;
	    }
	
	public static void main(String[] args) {
		String s="pTo*Ta*0";
		String s1="51Pa*0Lp*0e";
//		potat0  aP1pL5e
		PasswordDecryption p= new PasswordDecryption();
		System.out.println(p.decryptPassword(s1));
	}
}
