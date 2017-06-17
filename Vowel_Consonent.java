import java.util.*;
import java.io.*;
public class Vowel_Consonent
{
public static void main(String[] args)
{
char ch;
Scanner s = new Scanner(System.in);
System.out.println("enter the variables");
 ch = s.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
System.out.println(ch+" is vowel");
}
else if(ch>='a' && ch<='z')
{
System.out.println(ch+" is consonent");
}
else
{
System.out.println(ch+" is not an alphabet");
}}
}
