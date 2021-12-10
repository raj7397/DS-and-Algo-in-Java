import java.util.Scanner;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class StringQuestion {
    public static Scanner scn=new Scanner(System.in);
    public static void main(String [] args)
    {
        printAllPalindrome();
        
    }
    public static void printAllPalindrome()
    {
        String str=scn.next();
        int n=str.length();
        for(int start=0;start<n;start++)
        {
            for(int end=start;end<n;end++)
            {
                String subS=str.substring(start, end+1);
        //        System.out.println(subS);
                  if(isPalindrome(subS))
                  {
                      System.out.println(subS);
                  }
            }
        }
    }
    public static boolean isPalindrome(String str)
    {
        int i=0,j=str.length()-1;
        while(i<=j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void stringDemo()
    {
        String name="hello";
        String name2="hello";
        String name1=new String("hello");
        if(name==name2)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("no");
        }
        if(name.equals(name1)==true)
        {
            System.out.println("Yes");
        }else{
            System.out.println("no");
        }

   /*     String str="Rajkalalsh";
        System.err.println(str);;
        str=str+" "+"Rajbhar";
        System.out.println(str);
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            System.out.println("ch: "+ch);

        }
        System.out.println("Enter name: ");
        int n=scn.nextInt();
//        System.out.println("Enter char as input");
        char [] name=new char[n];
        System.out.println("Enter all chars: ");
        for(int i=0;i<n;i++)
        {
            name[i]=scn.next().charAt(0); 
        }
        System.out.println("All the chars are ");
        for(int i=0;i<n;i++)
        {
            System.out.println("char: "+name[i]);
        }*/
        //name[i]=scn.next().charAt();


    }
}
    

