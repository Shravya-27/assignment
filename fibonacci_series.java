import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
if(n>0)
{
  int n1=1;
  int n2=0;
  int n3=0;
  for( int i=0;i<n;i++)
  {
      System.out.println(n3+" ");
      n3=n1+n2;
      n1=n2;
      n2=n3;
  }
}
}
}

     
