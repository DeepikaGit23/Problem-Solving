package easy;

public class ReverseInteger 
{
	int rev=0;
	public int reverseNum(int num)
	{
		if(num==0)
			return rev;
		rev= rev*10+num%10;
		return reverseNum(num/10);
		
//		int rev=0;
//		while(num!=0)
//		{
//			rev= rev*10 + num%10;
//			num/=10;
//		}
		
	}
	
	public static void main(String[] args) 
	{
		int num=345;
		ReverseInteger r= new ReverseInteger();
		System.out.println(r.reverseNum(num));
	}
}
