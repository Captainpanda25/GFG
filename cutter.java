import java.util.*;
public class cutter {

	public static void main(String[] args) {
		int T,N,i,j,c=0;
		Scanner in =new Scanner(System.in);
		T=in.nextInt();
		for(i=0;i<T;i++)
		{
			N=in.nextInt();
			int a[]=new int[N];
			for(j=0;j<N;j++)
			{
				a[j]=in.nextInt();
			}
			Arrays.sort(a);
			for(j=N-1;j>0;j--)
			{
				if(a[j]!=a[j-1])
					c++;
			}
			c++;
			System.out.println(c);
		}
		

	}

}
