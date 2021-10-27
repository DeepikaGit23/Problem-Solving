package easy;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArray {
	public static void main(String[] args) 
	{
		int array1[]= new int[] {3,7,3,7,3,7,3};
		ArrayList<Integer> a= new ArrayList<>();
		for (int i : array1) {
			a.add(i);
		}
		Collections.sort(a);
		
		for (Integer integer : a) {
			System.out.println(integer);
		}
	}
}
	