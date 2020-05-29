import java.util.Scanner;

public class FindMissingNumber {

	public static void main (String[] args) {
        System.out.println("Enter size of array : ");
	    Scanner scanner= new Scanner(System.in);
	    int size= scanner.nextInt();
	    int sumOfTotal= (size*(size+1))/2;
	    int missingElement= sumOfTotal;
        System.out.println("Enter array elements : ");
        for(int i=0; i<size-1; i++){
	        int element= scanner.nextInt();
	        missingElement-=element;
	    }
	    scanner.close();
	   System.out.print("Missing number : "+missingElement);
	}
}
