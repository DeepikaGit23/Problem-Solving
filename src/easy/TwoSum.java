package easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum 
{
	public int[] twoSum1(int[] nums, int target )
	{
		Map<Integer, Integer> map= new HashMap<>();
		for(int i=0;i<nums.length;i++)
		{
			int complement=target-nums[i];
			if(map.containsKey(complement))
			{
				return new int[] {map.get(complement),i};
			}
			map.put(nums[i],i);
			
		}
		return new int[] {0,1};
	}
	
	public static void main(String[] args)
	{
		int[] nums= {2,7,11,15};
		int target=9;
		TwoSum t= new TwoSum();
		int[] ans=t.twoSum1(nums, target);
		for (int i : ans) {
			System.out.println(i);
		}
	}
}
