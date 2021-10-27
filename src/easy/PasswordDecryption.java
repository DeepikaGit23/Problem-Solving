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
	            	System.out.println("Inside number condition char is :"  + s.charAt(i));
	                stack.push(s.charAt(i));
	            }
	            else if(s.charAt(i)=='*')
	            {
	            	System.out.println("Inside * condition :" + s.charAt(i));
	            	res+=" ";
	            }
	            else if(s.charAt(i)==48) 
	        	{
	            	System.out.println("Inside 0 condition :" + s.charAt(i));
	            		char popped= stack.pop();
	            		res+=popped;
	        		System.out.println("String " + res + "popped char" + popped);
	        	}
	            
//	            else if((s.charAt(i+1)>=97 && s.charAt(i+1)<=122) && (s.charAt(i)>=65 && s.charAt(i)<=90))
	            else if((i+1)<s.length() && (s.charAt(i)>=65 && s.charAt(i)<=90))
	        	{
	            	if(s.charAt(i+1)>=97 && s.charAt(i+1)<=122)
	            	{
		            	System.out.println("Swap condition :" + s.charAt(i));
		        	    char temp='\0';
		        		char b=s.charAt(i+1);
		        		char a=s.charAt(i);
		        		temp=a;
		        		a=b;
		        		b=temp;
		        		res+=a;
		        		res+=b;
		        		i++;
	            	} 
	            	else
	            		res+=s.charAt(i);
	        	}
	            else {
	            	res+=s.charAt(i);
	            }
	            System.out.println(res);
	        }
	       res=res.replaceAll(" ","");
	        return res;
	    }
	
	public static void main(String[] args) {
		String s="1pTo*aT*0";
		String s1="51Pa*0Lp*0e";
//		poT aT 1  
//		aP 1pL 5e
		PasswordDecryption p= new PasswordDecryption();
		System.out.println(s);
		System.out.println(p.decryptPassword(s1));
	}
}
