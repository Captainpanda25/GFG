import java.util.Scanner;

public class me {

	public static void main(String[] args) {
		int T,N,i,j,sum,tot,c;
		Scanner in = new Scanner(System.in);
		T=in.nextInt();
	    for(i=0;i<T;i++)
	    {
	    	N=in.nextInt();
	    	int[] a=new int[N];
	    	tot=0;
	    	sum=0;
	    	c=N;
	    	for(j=0;j<N;j++)
	    	{
	    		a[j]=in.nextInt();
	    	}
	    	for(j=0;j<N;j++)
	    	{
	    		if(a[j]>0)
	    		{
	    			sum+=a[j];
	    			c--;
	    		}
	    		if(c==0)
	    		{
	    			sum=1;
	    			System.out.println(sum);
	    			break;
	    		}
	    		else if(a[j]<0)
	    		{
	    			tot=Math.abs(a[j])-sum;
	    			if(tot>0)
	    			{
	    				sum=tot+1;
	    				System.out.println(sum);
	    			}
	    			else
	    			{
	    				sum=1;
	    				System.out.println(sum);
	    			}
	    		}
	    	}
	    	
	    }

	}

}
