import java.util.*;
public class nis {

	public static void main(String[] args) {
			int T,i,j,sum;
			Scanner in = new Scanner(System.in);
			T=in.nextInt();
			for(i=0;i<T;i++)
			{
				String s=in.next();
				String a[]=s.split("\\D");
				sum=0;
				for(String num : a)
				{
					if (num.equals("")) {
						num = "0";
						}
					sum+=Integer.parseInt(num);
				}
				System.out.print(" "+sum);
			}
			in.close();
	}

}
