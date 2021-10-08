package assignmentsWeek1Day2;

public class palindrome {

	public static void main(String[] args ) {
String polin = "madam";
String rev="";;
char[] charArray = polin.toCharArray();
for (int i = charArray.length-1; i>=0; i--) {
	rev=rev+(charArray[i]);//
	

//System.out.print(rev);
	}

	if (rev.equals(polin)) {
	System.out.println("Polindrome");
}
else
	System.out.println("Not Polindrome");
	}
}
	
	
	


