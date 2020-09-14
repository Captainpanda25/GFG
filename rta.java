//To Rotate 2D array 90 degrees clockwise 
import java.util.*;
public class rta {

	public static void main(String[] args) {
		int T,N,i,j,k,c,m;
		Scanner in = new Scanner(System.in);
		T=in.nextInt();
	    for(i=0;i<T;i++)
	    {
	    	N=in.nextInt();
	    	int arr[][]=new int[N][N];
	    	for(j=0;j<N;j++)
	    	{
	    		for(k=0;k<N;k++)
	    		{
	    			arr[j][k]=in.nextInt();
	    		}
	    	}
	    	for(j=0;j<N;j++)
	    	{
	    		for(k=0;k<j;k++)
	    		{
	    			c=arr[j][k];
	    			arr[j][k]=arr[k][j];
	    			arr[k][j]=c;
	    		}
	    	}
	    	for(j=0;j<N;j++)
	    	{
	    		for(k=N-1,m=0;k>m;k--,m++)
	    		{
	    			c=arr[m][j];
	    			arr[m][j]=arr[k][j];
	    			arr[k][j]=c;
	    		}
	    	}
	    	
	    	for(j=0;j<N;j++)
	    	{
	    		for(k=0;k<N;k++)
	    		{
	    			System.out.print(arr[j][k]+" ");;
	    		}
	    		System.out.println();
	    	}
	    	
	    }

	}

}
