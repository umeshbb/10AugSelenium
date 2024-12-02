package method_with_return_type;

public class Sample1 {
	public static void main(String[] args) {
		Sample1 s1= new Sample1();
		int num3=s1.add(10, 20);
		
		System.out.println(num3);
		
		int num4 = s1.mul(10, 5);
		System.out.println(num4);
		
		
		
		
		
		
	}
	public static int add (int a,int b) {
		int c= a+b;
		return c;
	}
	public  int mul (int a ,int b) {
		int c= a*b;
		return c;
		
	}
	
	
	
	
	
	
	
	

}
