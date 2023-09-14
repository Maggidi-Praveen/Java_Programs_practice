public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="ssc lmth avaj ";
		String s1="";
		
		for (int i = 0; i<=s.length()-1; i++) {
			char ch=s.charAt(i);
			s1=ch+s1;
		}
		System.out.println("reverse of a given string " +s+" is : "+ s1);
	}
}
