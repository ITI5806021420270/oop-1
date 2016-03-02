import java.util.Scanner;
public class decode {
public static void main(String[] args) {
String decode,code;
char c;
int i=0;
Scanner scan = new Scanner(System.in);
System.out.print("Enter text : ");
decode=scan.nextLine();
code=decode.toUpperCase();
for(i=code.length()-1;i>=0;i--)
{
c=code.charAt(i);
if(c=='E'){
c='R';
}
else if(c=='R'){
c='W';
}
else if(c=='W'){
c='E';
}
System.out.print(c);
}
}
}