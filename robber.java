import java.util.*;

public class robber {

	public static void main(String[] args) {
		int T,N,i,n,m;
		Scanner in = new Scanner(System.in);
		T=in.nextInt();
		for(i=0;i<T;i++)
		{
			N=in.nextInt();
			m=in.nextInt();
			n=N/2;
			if(N%2==0)
			{
				m=n*m;
			}
			else
			{
				m=(n+1)*m;
			}
			System.out.println(m);
		}

	}

}
