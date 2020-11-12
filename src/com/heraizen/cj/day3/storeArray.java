package com.heraizen.cj.day3;
import java.util.Arrays;


public class storeArray {
	public static void main(String[ ] arg)
	  {
		int[] A={3,2,4,5,6,4,5,7,3,2,3,4,7,2,0,0,0};
		int sum=0;
      for(int num:A){
         sum+=num;
                             
      	}
      A[14]=sum;
//      System.out.println(Arrays.toString(A));
      int total = 0;
      for(int num:A){
          total+=num;
                              
       }
      int avg=total/15;
      A[15]=avg;
//      System.out.println(Arrays.toString(A));
      int max=A[0];
      int min=A[0];
      for(int i=0;i<A.length-1;i++)
      {
          if(A[i]>max)
          {
        	  max=A[i];
          }
          if(A[i]<min)
          {
        	  min=A[i];
          }                    
       }
//      System.out.println(min);
      A[16]=min;
      System.out.println(Arrays.toString(A));
	 }
	

}
