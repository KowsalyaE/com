import java.util.*;
public class vow
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String s1=s.next();
if((s1.charAt(0)=='a')||(s1.charAt(0)=='e')||(s1.charAt(0)=='i')||(s1.charAt(0)=='o')||(s1.charAt(0)=='u'))
{
System.out.println("vowel");
}
else
{
System.out.println("consonent");
}
}
}