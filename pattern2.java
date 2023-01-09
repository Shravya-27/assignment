import java.util.*;
public class Main{
    public static void main(String args){
        System.out.println("Enter the word");
        String str=(new java.util.Scanner(System.in)).next();
        char word[]=str.tocharArray();
        int length=str.length();
        System.out.println("pattern is");
        for(int i=0;i<length;i++){
            int index=0;
       
            for(int j=0;j<length-1;j++)
            {
                if(j>=i)
                System.out.println(word[index++]);
                else
                    System.out.print(" ");
        }
        System.out.println();
       
    }
}
}

