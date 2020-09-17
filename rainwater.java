import java.util.*;
public class rainwater {
	
	static int min(int i, int j)
	{
		if(i>j)
			return j;
		else return i;
	}

	public static void main(String[] args) {
		int T,N,i,j,sum,m;
		Scanner in = new Scanner(System.in);
		T=in.nextInt();
		while(T-->0)
		{
			m=0;
			sum=0;
			N=in.nextInt();
			int lmax,rmax,dif,sumax=0,jl,jr;
			int a[] = new int [N];
			for(i=0;i<N;i++)
			{
				a[i]=in.nextInt();
			}
			
			for(i=1;i<N-1;i++) 
			{
				sum=0;
				lmax=0;rmax=0;
				jl=0;jr=0;
				for(j=0;j<i;j++)
				{
					if(lmax<a[j])
					{
						lmax=a[j];
						jl=j;
					}
				}
				for(j=i+1;j<N;j++)
				{
					if(rmax<a[j])
					{
						rmax=a[j];
						jr=j;
					}
				}
				m=min(lmax,rmax);
				for(j=jl+1;j<jr;j++)
				{
					dif=m-a[j];
					if(dif>0)
						sum+=dif;
					if(sumax<sum)
						sumax=sum;
				}
			}
			System.out.println(sumax);
		}

	}

}

// 6 5 4 3 2 0 1
