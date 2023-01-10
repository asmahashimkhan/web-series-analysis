package lab111;

	import java.util.Random;
	import java.util.Scanner;
public class AA {		
		public static void main(String[] args) {
				
			int tenRandomIntegers[] = new int[10];
			
			Random random = new Random();
			Scanner sc = new Scanner(System.in);
				
			for (int i=0; i<10; i++) {
				tenRandomIntegers[i] = random.nextInt(1000);
			}
				
			
			System.out.print("Please enter an index number to display the element value: ");
			int indexNumber = sc.nextInt();
				
			try{
				System.out.print(tenRandomIntegers[indexNumber]);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println ("Array Index is Out Of Bounds");
			}
			
		}
	}