import java.util.Scanner;
public class ArrayQuestions{
    public static void main(String [] args){
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int [] arr=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=scn.nextInt();
    }
    int k=scn.nextInt();
    rotateByK(arr,k);
    display(arr);
}
    public static void rotateByK(int [] arr,int k)
    {
        int n=arr.length;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int [] arr,int i,int j)
    {
        while(i<j)
        {
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static void swap(int [] arr,int i,int j)
    {
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    public static void display(int [] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
