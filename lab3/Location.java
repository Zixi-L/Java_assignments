package lab3;
import java.util.Scanner;

public class Location
{
public int row, column;
public double maxValue;

public static int[] locateLargest(double[][] a)
{

double maxValueLocation = a[0][0];
int r,c;
int []b=new int[2];

for (int i = 0; i < a.length; i++)
{
for (int j = 0; j < a.length; j++)
{

if (a[i][j] > maxValueLocation)
{

maxValueLocation = a[i][j];
b[0]=i;b[1]=j;
}

}

}

return b;
}
public static void main(String[] args) 
{
Scanner input = new Scanner(System.in);

System.out.print("Enter the number of rows and columns of the array: ");
int numberOfRows = input.nextInt();
int numberOfColumns = input.nextInt();

double[][] a = new double[numberOfRows][numberOfColumns];

System.out.println("Enter array: ");

for (int i = 0; i < a.length; i++)
for (int j = 0; j < a[i].length; j++)
a[i][j] = input.nextDouble();

Location loc=new Location();
int arr[]= locateLargest(a);
System.out.println("\nThe largest element is located at (" +arr[0]+","+arr[1]+")" );
} 

}
