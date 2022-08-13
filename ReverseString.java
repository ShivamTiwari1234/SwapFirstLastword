public class ReverseString {
	public static void main(String[] args) {
		String s1="SHIVAM";
		String s2=" ";
		char ch;
		System.out.println("orginal Stirng");
		System.out.println("SHIVAM");
		for(int i=0;i<s1.length();i++) {
			ch=s1.charAt(i);
			s2=ch+s2;
		}
		System.out.println("Rverse String is "+s2);
	}

}
