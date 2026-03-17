import java.util.Scanner;
class HelloApp{
void main(){
Scanner ob = new Scanner(System.in);
String name = "World";
String args = ob.nextLine();
if(args.length() > 0)
name = args;
System.out.println("Hello, "+name+ "!");
}
}