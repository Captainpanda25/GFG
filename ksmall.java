import java.util.*;
public class ksmall {
	public static void main(String[] args) {
		int N,T,K,i,j;
		Scanner in = new Scanner(System.in);
		T=in.nextInt();
		for(i=0;i<T;i++)
		{
			N=in.nextInt();
			int a[]=new int[N];
			for(j=0;j<N;j++)
				a[j]=in.nextInt();
			K=in.nextInt();
			Arrays.sort(a);
			System.out.println(a[K-1]);
		}
	}
}