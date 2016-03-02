package encryption;
import java.util.Scanner;
public class encryption {
public static void main(String[] args) {
String code,decode;
char c;
int i=0;
Scanner scan = new Scanner(System.in);
System.out.print("Enter text : ");
code=scan.nextLine();
decode=code.toUpperCase();
for(i=decode.length()-1;i>=0;i--)
{
c=decode.charAt(i);
if(c=='R'){
c='E';
}
else if(c=='W'){
c='R';
}
else if(c=='E'){
c='W';
}
System.out.print(c);
}
}
}