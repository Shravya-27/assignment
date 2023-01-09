import java.util.*;
public class Main{
    public static void main(String args){
        System.out.println("Enter the word");
        String str=(new java.util.Scanner(System.in)).next();
        char word[]=str.tocharArray();
        int length=str.length();
        System.out.println("pattern is");
        for(int i=0;i<length;i++)
            for(int j=0;j<length-1;j++)
                System.out.println(word[j]);
                    System.out.println();
    }
}
