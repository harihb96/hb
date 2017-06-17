import java.io.*;
import java.util.*;
public class Check
{
public static void main(String[] args)
{
int a;
Scanner s = new Scanner(System.in);
System.out.println("enter the variables");
a=s.nextInt();
if(a<0)
{
System.out.println("negative");
}
else if(a>0)
{
System.out.println("positive");
}
else
{
System.out.println("zero");
}
}
}
