package assignmentsWeek1Day2;


public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String arr[] = text.split(" ");
		for (int i = 0; i < arr.length; i++) {
			//System.out.println(arr[i]);
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					arr[j]="";
					
				}
			}
			if(arr[i]!="") {
			System.out.print(arr[i]+" ");}
				
		}
		
	}
}	
		
	
