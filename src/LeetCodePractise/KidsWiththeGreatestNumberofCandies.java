package LeetCodePractise;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
	
	public static void main(String[] args) {
		
		KidsWiththeGreatestNumberofCandies c= new KidsWiththeGreatestNumberofCandies();
		int[] candies = {8,1,3,1,3};
		int extraCandies =2;
		List<Boolean>result=c.kidsWithMoreCandies(candies, extraCandies);
		System.out.println(result);
		
	}
	
	public List<Boolean> kidsWithMoreCandies(int[] candies, int extraCandies)
	{
		
		List<Boolean> result = new ArrayList<>();
		
		int maxCandies = candies[0];
		for(int i=1;i<candies.length;i++)
		{
		   if(candies[i]>maxCandies)
		   {
			   maxCandies= candies[i];
		   }			
		}
		
		for (int candy : candies) {
			 result.add(candy + extraCandies >= maxCandies );
			 
		}
		
		return result;
		
		
	}
}