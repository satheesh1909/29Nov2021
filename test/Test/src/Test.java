
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test");
		String a= "Satheesh";	
		String b = "Satheesh";
		String c= a.concat(b);
		System.out.println(c);
		int n = 300;
		int m = 200;
		int o= n*m;
		System.out.println(o);
		if(a==b)
		{
			System.out.println("OK");
		}
		if(a.equals(b))
		{
			System.out.println("2 OK");
		}
		int min=(n<m)?n:m;
		System.out.println(min);
	}

}
