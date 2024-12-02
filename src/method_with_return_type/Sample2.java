package method_with_return_type;

import net.bytebuddy.utility.RandomString;

public class Sample2 {
public static void main(String[] args) {
	
	
	Sample2 ss=new Sample2();
	
	int num=ss.add(10, 20);
	
	System.out.println(num + "=================");
	
	int mul = ss.mul(5, 5);
	System.out.println("======"+mul + "===========");
	
	String str= ss.tolowercase("BIRAJDAR");
	System.out.println("======"+str+"===========");
	
	String str1=ss.touppercase("umesh");
	System.out.println("======="+str1+"===========");
	
	
	int length = ss.lengthofstring(str1);
	System.out.println("length of string "+length +"=================");
	
	String names = ss.generaterandomname(10);
	System.out.println("random strings "+names +"=============");
	
	
	
	
}

 public int add (int a,int b) {
	 int c=a+b;
	 return c;
 }

public int mul (int a,int b )
{
	int c= a*b;
	return c;
	
}
 public String touppercase( String name) {
	 String s1= name.toUpperCase();
	 return s1;
	 
 }
public String tolowercase(String lname) {
	String s2=lname.toLowerCase();
	return s2;
	
}

public int  lengthofstring (String name) {
	int length =name.length();
	return length;
	
}

public String generaterandomname (int length ) {
	String name=RandomString.make(length);
			return name;
}










}
