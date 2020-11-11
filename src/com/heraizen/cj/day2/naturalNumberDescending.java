package com.heraizen.cj.day2;
import java.util.Scanner;
public class naturalNumberDescending {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of natural numbers to be generated:");
		int num=scan.nextInt();
		int a[] = new int[num];
		for(int j=1;j<num+1;j++)
		{
			a[j-1]=j;
		}
		
		for (int i = 0; i < num; i++) 
        {
            for (int j = i + 1; j < num; j++) 
            {
                if (a[i] < a[j]) 
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("The first "+ num + "natural numbers in descending order are: ");
        for (int i = 0; i < num; i++) 
        {
            System.out.print(a[i] + " ");
        }
		
		scan.close();
	}
}
