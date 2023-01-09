import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String str;

System.out.println("Enter the string");
   str=sc.nextLine();
for(int i=0;i<str.length();i++)
   {
if(str.charAt(i) =='a'|| str.charAt(i) =='e' || str.charAt(i) =='i' || str.charAt(i) =='o' || str.charAt(i) =='u')
           System.out.println("Given string contains vowel"+str.charAt(i)+""+" in the index"+i);
   }
}
}
