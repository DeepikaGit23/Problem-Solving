package collectionsInJava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JavaHashSet {

	public static void main(String[] args) {
		Set<Integer> numberSet= new HashSet<>();
		List<Integer> numberList =Arrays.asList(1,2,5,3,4);
		numberSet.addAll(numberList);
		
		String avg=numberSet
		.stream()
		.mapToInt(x->x+1)
		.filter(x->x >0)
		.sorted()
		.average().toString();
//		.forEach(System.out :: println);
		System.out.println("Average: " + avg);
				
	}

}
