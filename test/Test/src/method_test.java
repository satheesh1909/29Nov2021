
public class method_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1;
		int b=2;
		int c = method_add(1,2);
		System.out.println(c);
		int d = method_multiply(a,b);
				System.out.println(d);		
		int e = method_multiply(a,b,2);
				System.out.println(e);
		
	}
	
	public static int method_add(int a, int b)
	{
		int c=a+b;
		return c;		
		
	}
	public static int method_multiply(int a, int b)
	{
		int c=a*b;
		return c;
	}
	public static int method_multiply(int a, int b, int c)
	{
		int d=a*b*c;
		return d;
	}
	
	
}


