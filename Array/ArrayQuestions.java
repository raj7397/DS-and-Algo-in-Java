import java.util.Scanner;

//import javax.lang.model.util.ElementScanner6;
public class ArrayQuestions{
    public static Scanner scn=new Scanner(System.in);
    public static int binarySearch(int [] arr,int x)
    {
        int li=0,ri=arr.length-1;
        while(li<=ri)
        {
            int mid=(li+ri)/2;
            if(x==arr[mid]){
                return mid;
            }
            else if(x<arr[mid])
            {
                ri=mid-1;
            }
            else if(x>arr[mid])//default condition
            {
                li=mid+1;
            }
        }
        return -1;
    }
    public static void subset(int [] arr)
    {   int n=arr.length;
        int total=(int)Math.pow(2,n);
        for(int i=0;i<total;i++)
        {
            int temp=i;
            for(int j=n-1;j>=0;j--)
            {
                int r=temp%2;
                temp/=2;
                if(r==0)
                {
                    System.out.print("-\t");
                }
                else{
                    System.out.println(arr[j]+"\t");
                }
              //  if((i & (1<<j))==0)
                //{
                  //  System.out.print("-\t");
                //}else{
                  //  System.out.print(arr[j]+"\t");
                //}
            }
            System.out.println();
        }

    }
    public static void printCeilAndFloor()
    {
        int n=scn.nextInt();
        int [] arr=new int[n];
        inputOneDArray(arr);
        int x=scn.nextInt();
        CeilAndFloor(arr,x);   
    }
    public static void CeilAndFloor(int [] arr,int x)
    {
        int li=0,ri=arr.length-1;
        int ceil=-1,floor=-1;
        while(li<=ri){
            int mid=(li+ri)/2;
            if(x==arr[mid])
            {
                floor=arr[mid];
                ceil=arr[mid];
                break;
            }
            else if(x<arr[mid])
            {
                ceil=arr[mid];
                ri=mid-1;
            }
            else{
                li=mid+1;
                floor=arr[mid];
            }
        }
        System.out.println("Floor: "+floor);
        System.out.println("Ceil: "+ceil);
    }
    public static void inputOneDArray(int [] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
    }
    public static void printFirstAndLastIndex()
    {
        int n=scn.nextInt();
        int [] arr=new int[n];
        inputOneDArray(arr);
        int x=scn.nextInt();
        int fi=firstIndex(arr,x);
        int li=lastIndex(arr,x);
        System.out.println("First index: "+fi);
        System.out.println("last index: "+li);
    }
    public static int lastIndex(int [] arr,int x)
    {
        int lsti=-1;
        int li=0,ri=arr.length-1;
        while(li<=ri){
            int mid=(li+ri)/2;
            if(arr[mid]==x)
            {
                lsti=mid;
                li=mid+1;
            }
            else if(x<arr[mid])
            {
                ri=mid-1;
            }
            else{
                li=mid+1;
            }
        }
        return lsti;
    }
    public static int firstIndex(int [] arr,int x)
    {
        int fi=-1;
        int li=0,ri=arr.length-1;
        while(li<=ri){
            int mid=(li+ri)/2;
            if(x==arr[mid])
            {
                fi=mid;
                ri=mid-1;
            }
            else if(x<arr[mid])
            {
                ri=mid-1;
            }
            else{
                li=mid+1;
            }
        }
        return fi;
    }
    public static void printSubArray()
    {
        int n=scn.nextInt();
        int [] arr=new int[n];
        inputOneDArray(arr);
        subArray(arr);

    }
    public static void subArray(int []arr)
    {
        int n=arr.length;
        for(int start=0;start<n;start++)
        {
            for(int end=start;end<n;end++)
            {
                for(int k=start;k<=end;k++)
                {
                    System.err.print(arr[k]+"\t");
                }
                System.err.println();
            }
        }
    }
    public static void main(String [] args){
        printSubArray();
        //printFirstAndLastIndex();

    //    printCeilAndFloor();
  //  Scanner scn=new Scanner(System.in);
    /*int n=scn.nextInt();
    int [] arr=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=scn.nextInt();
    }
    int x=scn.nextInt();
    int ans=binarySearch(arr, x);
    System.out.println("Ans: "+ans);*/
    //subset(arr);
//    int k=scn.nextInt();
  //  rotateByK(arr,k);
    //display(arr);
}
    public static void rotateByK(int [] arr,int k)
    {
        
        int n=arr.length;
        k=(k%n+n)%n;
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
