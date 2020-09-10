/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class sm {
	public static void main (String[] args) {
	    int T,i,j,k,n,tmp,l;
	    Scanner in = new Scanner(System.in);
	    T=in.nextInt();
	    for(i=0;i<T;i++)
	    {
	        n=in.nextInt();
	        int[] a = new int[n*n];
	        int[][] m = new int[n][n];
	        l=0;
	        for(j=0;j<n&&l<n*n;j++)
	        {
	            for(k=0;k<n;k++)
	            {
	                m[j][k]=in.nextInt();
	                a[l]=m[j][k];
	                l++;
	            }
	        }
	        Arrays.sort(a);
	        System.out.println(""+Arrays.toString(a));
	    }
	}
}