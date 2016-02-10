import java.util.Scanner;
public class Kornislav {
private static Scanner scan;

public static void main(String args []){
int operator1,operator2,operator3,operator4,temp;
scan = new Scanner(System.in);
System.out.print("Input operator_1 : ");
operator1 = scan.nextInt();
System.out.print("Input operator_2 : ");
operator2 = scan.nextInt();
System.out.print("Input operator_3 : ");
operator3 = scan.nextInt();
System.out.print("Input operator_4 : ");
operator4 = scan.nextInt();
if(operator1>operator2){
temp = operator1;
operator1 = operator2;
operator2 = temp;
}
if(operator1>operator3){
temp = operator1;
operator1 = operator3;
operator3 = temp;
}
if(operator1>operator4){
temp = operator1;
operator1 = operator4;
operator4 = temp;
}
if(operator2>operator3){
temp = operator2;
operator2 = operator3;
operator3 = temp;
}
if(operator2>operator4){
temp = operator2;
operator2 = operator4;
operator4 = temp;
}
if(operator3>operator4){
temp = operator3;
operator3 = operator4;
operator4 = temp;
}
System.out.print("\nRectangle Area = : "+""+operator3+""+
" * "+operator1+" = "+operator3*operator1);
}
}
