package test3;

public class StringCompareEg {
	public static void main(String args[]) {
		String s1="Logi";
		String s2="Priya";
		String s3="Gayu";
		String s4="Anu";
		String s5="Logi";
		String s6="ram";
		
		System.out.println(s1.compareTo(s4));
		System.out.println(s3.compareTo(s2));
		System.out.println(s3.compareTo(s4));
		System.out.println(s2.compareTo(s6));

		int s=s1.compareTo(s5);
		System.out.println(s);
		
		if(s==0)
		{
			System.out.println("Same String");
		}
		else
		{
			System.out.println("Not a Same String");
		}
	}
}
