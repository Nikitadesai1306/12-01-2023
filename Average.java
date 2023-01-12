//Compute the average value of an array of integers except the largest an
//d smallest values 
package Com.Demo.Average;
import java.util.*;
import java.io.*;


public class Average {

	public static void main(String[] args) {
		int[] array_nums = {1,2,3,4,5};
		System.out.println(Arrays.toString(array_nums));
		int max = array_nums[0];
		int min = array_nums[0];
		float sum = array_nums[0];
		for(int i =1; i < array_nums.length; i++);
		
		sum += array_nums[1];
		if (array_nums[1]>max)
		max=array_nums[1];
		
		else if (array_nums[1]<min)
		min=array_nums[1];
	
		float x =((sum -min-max)/(array_nums.length-2));
		System.out.println("compute the average value of an array of integer except the largest and smallest values : %.2f",x);
		System.out.println("/n");

	}

}
