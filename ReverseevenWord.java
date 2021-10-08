package assignmentsWeek1Day2;

public class ReverseevenWord {

	public static void main(String[] args) {
		String test = "In am as software tester"; 
		String[] split = test.split(" ");
		for (int i = 0; i < split.length; i++) {
			//System.out.print(split[i]+" ");
			if(i%2==0) {
				//System.out.println("");
				//System.out.println(split[i]);
				char[] charArray = (split[i]).toCharArray();
			
			for (int j = charArray.length-1; j>=0; j--) {
				System.out.print(charArray[j]);
			}	
			}
				
			else
				System.out.print(split[i]+" ");
		}				
			
		}
		
	}


