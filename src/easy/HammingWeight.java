package problemSolving;
import java.util.Stack;

public class HammingWeight {
	
	Stack st= new Stack();

	public int weight(int n) {
		return Integer.bitCount(n);
	}
	
	public static void main(String[] args) {
		HammingWeight h= new HammingWeight();
		System.out.println(h.weight(11));
	}
	
}
