import java.util.*;
public class stack {
	char a[]=new char[10];
	int top;
	stack()
	{
		top = -1;
	}
	void push(char c)
	{
		if(top>=10)
		{
			System.out.println("Stack overflow!");
		}
		else
		{
			a[++top]=c;
		}
	}
	int pop()
	{
		if(top<0)
		{
			System.out.println("Stack underflow!");
			return 0;
		}
		else
		{
			int r=a[top--];
			return r;
		}
	}
	char peek()
	{
		if (top<0)
		{
			System.out.println("Stack is empty!");
			return 0;
		}
		else
		{
			//System.out.println("Top of the stack: "+a[top]);
			return a[top];
		}
	}

	public static void main(String[] args) {
		stack s=new stack();
		String arr= new String();
		Scanner in =new Scanner(System.in);
		arr=in.next();
		char c;
		for(int i=0;i<arr.length();i++)
		{
			c=arr.charAt(i);
			if(c=='{'||c=='('||c=='[')
			{
				s.push(c);
			}
			else 
			{
				char e=s.peek();
				if(e=='('&&c==')')
				s.pop();
				else if(e=='['&&c==']')
					s.pop();
				else if(e=='{'&&c=='}')
					s.pop();
			}
		}
		if(s.peek()!=0)
		{
			System.out.println("The string is not balanced!");
		}
		else 
			System.out.println("Balanced String!");
	}	

}
