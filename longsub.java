import java.util.Arrays;
import java.util.Scanner;

public class longsub {

	public static void main(String[] args) {
		int N,T,i,j,c,max;
		Scanner in = new Scanner(System.in);
		T=in.nextInt();
		for(i=0;i<T;i++)
		{
			c=0;
			max=0;
			N=in.nextInt();
			int a[]=new int[N];
			for(j=0;j<N;j++)
				a[j]=in.nextInt();
			if(N==1)
				System.out.println(N);
			else
			{
			Arrays.sort(a);
			for(j=0;j<N;j++)
			{
				if(j!=N-1&&a[j]==a[j+1]-1)
				{
					c++;
					if(c>max)
					max=c;
				}
				else if(j==N-1&&a[j]==a[j-1]+1)
				{
					c++;
					if(c>max)
					max=c;
				}
				else if(j!=N-1&&a[j]==a[j+1])
				{
					continue;
				}
				else
				{
					c++;
					if(c>max)
					max=c;
					c=0;
				}		
			}
			System.out.println(max);
			}
		}
		
	}

}
