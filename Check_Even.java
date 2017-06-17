import java.util.*;
public class Check_Even
{
public static void main(String[] args)
{
int a;
Scanner s = new Scanner(System.in);
System.out.println("enter the variables");
a=s.nextInt();
if((a%2)==0)
{
System.out.println("the number is even " +a);
}
else 
{
System.out.println("the number is odd " +a);
}
}
}
