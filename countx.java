import java.util.*;

public class countx {

	public static void main(String[] args) {
		int L,U,X,T,i,j,l,c,r;
		Scanner in = new Scanner(System.in);
		T=in.nextInt();
		for(i=0;i<T;i++)
		{
			c=0;
			X=in.nextInt();
			L=in.nextInt();
			U=in.nextInt();
			for(j=L+1;j<U;j++)
			{
				l=j;
				while(l>0)
				{
					r=l%10;
					if(r==X)
						c++;
					l/=10;
				}
			}
			System.out.println(c);
		}

	}

}
