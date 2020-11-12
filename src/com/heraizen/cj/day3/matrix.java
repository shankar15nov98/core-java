package com.heraizen.cj.day3;

import java.util.Scanner;

public class matrix {
	public static void main(String[ ] arg)
	   {
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter number of rows ");
        int m = scan.nextInt(); 
        System.out.print("Enter number of columns "); 
        int n = scan.nextInt(); 
        int a[][] = new int[m][n]; 
        if (m == n) 
        { 
            System.out.println( "Enter all the values of matrix "); 
            for (int i = 0; i < m; i++) { 
                for (int j = 0; j < n; j++) { 
                    a[i][j] = scan.nextInt(); 
                } 
            }
            int sum=0;
            for (int i = 0; i < m; i++) { 
                for (int j = 0; j < n; j++) { 
                	sum+=a[i][j];
                }
                }
            int max=a[0][0];
            int min=a[0][0];
            for (int i = 0; i < m; i++) 
            { 
                for (int j = 0; j < n; j++) 
                { 
                	if(a[i][j]>max)
                    {
                   	 max=a[i][j];
                    }
                                        
                    if(a[i][j]<min)
                    {
                   	 min=a[i][j];
                    }
                }
                
             }
            int sumDiagonal=0;
            for (int i = 0; i < m; i++) 
            { 
                for (int j = 0; j < n; j++) 
                { 
                	if(i==j)
                	{
                		sumDiagonal+=a[i][j];
                	}
                }
             }
            
            System.out.println( "sum of elements in the matrix: "+sum); 
            System.out.println( "Biggest elements in the matrix: "+max); 
            System.out.println( "Diagonal sum of the matrix: "+sumDiagonal);
            System.out.println( "Transpose of the given matrix: ");
            int b[][] = new int[m][n];
            for(int i = 0;i<3;i++){
                for(int j = 0;j<3;j++){
                   b[i][j] = 0;
                   for(int k = 0;k<3;k++){
                      b[i][j]=a[j][i];
                   }
                   System.out.print(b[i][j]+" ");
                }
                System.out.println();
             }
        }
		scan.close();
	   }
	   
}
