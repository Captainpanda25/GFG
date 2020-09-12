import java.util.*;
public class mindiff {
	public static void main(String[] args) {
		int T,N,i,j,min,dif;
		Scanner in = new Scanner(System.in);
		T=in.nextInt();
		for(i=0;i<T;i++)
		{
			N=in.nextInt();
			int a[]=new int[N];
			for(j=0;j<a.length;j++)
			{
				a[j]=in.nextInt();
			}
			Arrays.sort(a);
			dif=0;
			min=a[1]-a[0];
			for(j=1;j<a.length;j++)
			{
				dif = a[j]-a[j-1];
				if(min>dif)
				{
					min=dif;
				}
			}
			System.out.println(min);
		}
	}
}