import java.util.*;
public class gors {

	public static void main(String[] args) {
		int T, N;
		int i,j,k,max;
		int[] arr,far;
		Scanner in = new Scanner(System.in);
		T=in.nextInt();
		for(i=0;i<T;i++)
		{
			N=in.nextInt();
			arr=new int[N];
			far=new int[N];
			for(j=0;j<N;j++)
			{
				arr[j]=in.nextInt();
			}
			for(j=0;j<N-1;j++)
			{
				max=0;
				for(k=j+1;k<N;k++)
				{
					if(max<arr[k])
					{
						max=arr[k];
					}
				}
				far[j]=max;
			}
			far[N-1]=-1;
			for(j=0;j<N;j++)
			{
				System.out.print(far[j]+" ");
			}
			
		}
		
	}

}
