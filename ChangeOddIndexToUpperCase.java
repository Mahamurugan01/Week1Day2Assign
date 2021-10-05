package assignmentsWeek1Day2;


public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
//System.out.println(charArray[i]);
if(i%2 !=0)
{
	System.out.println(Character.toUpperCase(charArray[i]));
}
else
	System.out.println(charArray[i]);

			}
			
		}
	}



