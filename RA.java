import java.util.*;
public class RA {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T, N, D;
		int i,j,k;
		int[] arr;
		int[] rar;
		T=in.nextInt();
		for(i=0;i<T;i++)
		{

			N=in.nextInt();
			arr= new int[N];
			rar= new int[N];
			D=in.nextInt();
			for(j=0,k=0;j<N;j++,k++)			//Scanning input for the array of length N
			{
				arr[j] = in.nextInt();
				if(k<D)
					rar[k]=arr[j];				//Storing the elements after which the array has to be rotated
			}
			
			for(j=0;j<D;j++)                    //Rotating the array of length N-D
			{
				for(k=0;k<N-1;k++)
				{
					arr[k]=arr[k+1];
				}
			}
			
			for(j=N-D,k=0;j<N;j++,k++)          //Appending the array of length D to the new array of length N-D
			{
				arr[j]=rar[k];
			}
			
			for(j=0;j<N;j++)                    //Printing the final array
			{
				System.out.print(arr[j]+" ");
			}
			System.out.println("");
		}
	}

}
