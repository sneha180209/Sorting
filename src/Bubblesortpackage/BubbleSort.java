package Bubblesortpackage;
import java.util.Scanner;  
public class BubbleSort 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");
		n=sc.nextInt();  
		int[] arr = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
			arr[i]=sc.nextInt();  
		}    
   
		int temp = 0;  
		for(int i=0; i < n; i++)
		{
			for(int j=1; j < (n-i); j++)
		    {
				if(arr[j-1] > arr[j])
		        {
					temp = arr[j-1];  
		            arr[j-1] = arr[j];  
		            arr[j] = temp;  
		        }  
		                  
		    }  
		}
		System.out.println("Array After Bubble Sort");  
        for(int i=0; i < arr.length; i++)
        {  
                System.out.print(arr[i] + " ");  
        }    
	}

}



