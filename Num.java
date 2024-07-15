import java.util.Arrays;
import java.util.Scanner;
public class Num{
	public static void main (String [] args){
	Scanner input = new Scanner(System.in);
 
int [] display = new int [10];
	
for(int count = 0; count <10; count++){
System.out.print("collect number from user : ");
	 display[count]  = input.nextInt();
if(display % 2 == 0){
System.out.print("even");
}
else{
System.out.print("odd");
}



	}
System.out.print(Arrays.toString(display));




	} 
}
