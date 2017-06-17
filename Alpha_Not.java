import java.util.*;
import java.io.*;
public class Alpha_Not
{
public static void main(String[] args)
{
char ch;
Scanner s = new Scanner(System.in);
System.out.println("enter the variables");
 ch = s.next().charAt(0);
if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
{
System.out.println(ch+" is alphabet");
}
else
{
System.out.println(ch+" is not an alphabet");
}}
}
