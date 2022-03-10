package problemSolving;

public class Bin {
    public static long minOperations(long n) {
    // Write your code here
    String bin=Long.toBinaryString(n);
//    System.out.println(bin);
//    char[] bin1= new char[bin.length()];
//    
//    for(int i=0; i<bin.length();i++)
//    {
//        bin1[i]=bin.charAt(i);
//    }
//    
//    for(int i=0; i<bin.length();i++)
//    {
//        System.out.println(bin1[i]);
//    }
//    
    	
    	if(n<=1L)
    		return n;
    	
    	int bit= (int) (Math.log(n)/ Math.log(2))+1;
    	System.out.println("bit  : " + bit);
    	System.out.println("(1<< bit)-1    :" + ((1<< bit)-1) );
    	System.out.println("n-(1<<(bit-1))  :" + (n-(1<<(bit-1))));
    	return ((1<< bit)-1)- minOperations(n-(1<<(bit-1)));
   
    }
    public static void main(String[] args) {
		Bin b= new Bin();
		System.out.println(b.minOperations(5L));
	}

}
