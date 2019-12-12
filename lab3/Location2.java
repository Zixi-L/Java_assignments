package lab3;
import java.util.Scanner;
public class Location2
{
public int row, column;
public static double maxValue;
public static int[] locateLargest(double[][] array)
{
	{
}
	double maxValueLocation = array[0][0];
	int row,column;
	int []b=new int[2];
	for (int i = 0; i < array.length; i++)
	{
	for (int j = 0; j < array.length; j++)
	{
		
		if (array[i][j] > maxValueLocation)
		{
			maxValue = array[i][j];
			maxValueLocation = array [i][j];
			b[0]=i;b[1]=j;
		}
	}
}
return b;
}


	
