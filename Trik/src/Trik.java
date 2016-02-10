import java.util.Scanner;
public class Trik {
private static Scanner scan;

public static void main(String args [] )
{
	int left = 1,middle = 0,right = 0,temp,i;
	String swap;
	scan = new Scanner(System.in);
	System.out.print("Enter Value : ");
	swap = scan.next();
	for(i=0;i<swap.length();i++){
	if(swap.charAt(i) == 'A' || swap.charAt(i) == 'a'){
	temp = left;
	left = middle;
	middle = temp;
	}else if(swap.charAt(i) == 'B' || swap.charAt(i) == 'b'){
	temp = middle;
	middle = right;
	right = temp;
	}else{
	temp = left;
	left = right;
	right = temp;
	}
	}
	if( left == 1){
		System.out.println("Coin is in Left glass");
	}
	else if(middle == 1){
		System.out.println("Coin is in Middle glass");
	}
	else System.out.println("Coin is in Right glass");
}
}
