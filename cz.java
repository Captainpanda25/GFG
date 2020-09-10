import java.util.Scanner;

public class cz {

	public static void main(String[] args) {
		int T,N,i,j,k,c;
		Scanner in = new Scanner(System.in);
		T=in.nextInt();
	    for(i=0;i<T;i++)
	    {
	    	N=in.nextInt();
	    	int[] a = new int[N];
	    	c=0;
	    	for(j=0;j<N;j++)
	    	{
	    		a[j]=in.nextInt();
	    	}
	    	
	    	for(j=N-1;j>=0;j--)
	    	{
	    		if(a[j]==0)
	    			c++;
	    	}
	    	System.out.println(c);
	    }

	}

}
