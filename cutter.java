//To set the size of cutter and perform the operation of cutting the sticks in min number of operations
import java.util.*;
public class cutter {

	public static void main(String[] args) {
		int T,N,i,j,c=0;
		Scanner in =new Scanner(System.in);
		T=in.nextInt();                            //Scanning th number of Test cases
		for(i=0;i<T;i++)
		{
			N=in.nextInt();			   //Scanning the input size of sticks
			int a[]=new int[N];
			for(j=0;j<N;j++)
			{
				a[j]=in.nextInt();	    //Scanning height os the sticks in input size N
			}
			Arrays.sort(a);			    //Sorting the sticks in ascending order with respect to their size
			for(j=N-1;j>0;j--)
			{
				if(a[j]!=a[j-1])	    //Performing the cutting operation
					c++;
			}
			c++;
			System.out.println(c);		    //Returning the number of operations
		}
		

	}

}
