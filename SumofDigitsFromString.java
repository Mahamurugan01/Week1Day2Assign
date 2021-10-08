package assignmentsWeek1Day2;

public class SumofDigitsFromString {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		int sum = 0;
		String replaceAll1 = text.replaceAll("[\\D]","");
		System.out.print(replaceAll1);
		char [] charArray = replaceAll1.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			int numericValue = Character.getNumericValue(charArray[i]);
			
		sum=sum+numericValue;
		}
		System.out.println(" ");
		System.out.print(sum);
		
	}
	

}

