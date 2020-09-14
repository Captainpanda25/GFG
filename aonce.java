import java.util.Scanner;

public class aonce {

	public static void main(String[] args) {
		int N,T,i,j,l,c,r;
		Scanner in = new Scanner(System.in);
		T=in.nextInt();
		for(i=0;i<T;i++)
		{
			N=in.nextInt();
			int a[]=new int[N];
			for(j=0;j<N;j++)
				a[j]=in.nextInt();
			for(j=0;j<N;j++)
			{
				if(j!=0&&j!=N-1)
				{
					if(a[j]!=a[j+1]&&a[j]!=a[j-1])
					{
						System.out.println(a[j]);
						break;
					}
				}
				else if(j==0)
				{
					if(a[j]!=a[j+1])
					{
						System.out.println(a[j]);
						break;
					}
				}
				else
				{
					if(a[j]!=a[j-1])
					{
						System.out.println(a[j]);
						break;
					}
				}
			}
		}
	}
}
