import java.util.*;
class calculator{
public static int add(int a,int b){
return a+b;
}
public static int sub(int a,int b)
{
return Math.max(a,b)-Math.min(a,b);
}
public static int mul(int a,int b){
return a*b;
}
public static double div(int a,int b)
{
return (Math.max(a,b))/(Math.min(a,b));
}
public static void main(String args[]){
Scanner in=new Scanner(System.in);
while(true){
System.out.println("Enter your choice : 1. Addition , 2. Substraction , 3. Multiplication, 4. Division , 5. Exit");
int ch =in.nextInt();
switch(ch){
case 1:
System.out.println("Enter the two numbers:");
int a=in.nextInt();
int b=in.nextInt();
System.out.println("Add :"+(add(a,b)));
break;
case 2:
System.out.println("Enter the two numbers:");
 a=in.nextInt();
 b=in.nextInt();
System.out.println("Sub :"+(sub(a,b)));
break;
case 3:
System.out.println("Enter the two numbers:");
 a=in.nextInt();
 b=in.nextInt();
System.out.println("Product :"+(mul(a,b)));
break;
case 4:
System.out.println("Enter the two numbers:");
 a=in.nextInt();
 b=in.nextInt();
System.out.println("Division :"+(div(a,b)));
break;
case 5:
System.exit(1);
break;
default:
System.out.println("Wrong choice!");
}
}
}
}
