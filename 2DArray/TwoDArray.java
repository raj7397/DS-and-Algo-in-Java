import java.util.Scanner;
public class TwoDArray {
        public static Scanner sc=new Scanner(System.in);
        public static void printMultiplyMatrix()
        {
            int m1=sc.nextInt();
            int n1=sc.nextInt();
            int [][] A=new int[m1][n1];

            input(A);
            int m2=sc.nextInt();
            int n2=sc.nextInt();
            int [][] B=new int[m2][n2];
            input(B);
            if(n1!=m2)
            {
                System.out.println("Invalid input");
            }else{
                int [][] C=new int[m1][n2];
                C=multipyMatrix(A,B);
                display(C);
            }
            //display(arr);
            //multipyMatrix(arr);
        }    
        public static void main(String [] args)
        {    
            //printSpiral();        
            printSpiral2();
//            printStateOfWakanda();
           // printStateOfWanakand2();
        }
        public static void printSpiral2()
        {
            int m=sc.nextInt();
            int n=sc.nextInt();
            int [][] arr=new int[m][n];
            input(arr);
            spiral2(arr);
        }
        public static void spiral2(int [][] arr)
        {
            int m=arr.length;
            int n=arr[0].length;
            int count=0;
            int total=m*n;
            int minr=0;
            int minc=0;
            int maxr=m-1;
            int maxc=n-1;
            while(count<total)
            {
                for(int i=minc;i<=maxc && count<total;i++)
                {
                    System.out.println(arr[minr][i]);
                    count++;
                }
                minr++;
                for(int i=minr;i<=maxr && count<total;i++ )
                {
                    System.out.println(arr[i][maxc]);
                    count++;
                }
                maxc--;
                for(int i=maxc;i>=minc && count<total;i--)
                {
                    System.out.println(arr[maxr][i]);
                    count++;
                }
                maxr--;
                for(int i=maxr;i>=minr && count<total;i--)
                {
                    System.out.println(arr[i][minc]);
                    count++;
                }
                minc++;
            }
        }
        public static void printSpiral()
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int  [][] arr=new int[n][m];
            input(arr);
            spiral(arr);
            
        }
        // public static void inputCharArray(char [][] arr)
        // {
        //     int n=arr.length;
        //     int m=arr[0].length;
        //     for(int i=0;i<n;i++)
        //     {
        //         for(int j=0;j<m;j++)
        //         {
        //             arr[i][j]=sc.next
        //         }
        //     }
        // }
        public static void spiral(int [][] arr)
        {
            int m=arr.length;
            int n= arr[0].length;
            int count=0;
            int total=m*n;
            int minr=0;
            int minc=0;
            int maxr=m-1;
            int maxc=n-1;
            while(count<total)
            {
                for(int i=minr;i<=maxr && count<total;i++)
                {
                    System.out.println(arr[i][minc]);
                    count++;
                }
                minc++;
                for(int i=minc;i<=maxc && count<total;i++)
                {
                    System.out.println(arr[maxr][i]);
                    count++;
                }
                maxr--;
                for(int i=maxr;i>=minr && count<total;i--)
                {
                    System.err.println(arr[i][maxc]);
                    count++;
                }
                maxc--;
                for(int i=maxc;i>=minc && count<total;i--)
                {
                    System.out.println(arr[minr][i]);
                    count++;
                }
                minr++;

            }
        }
        public static void printStateOfWanakand2()
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int [][] arr=new int[n][m];
            input(arr);
            stateOfWakanda2(arr);

        }
        public static void stateOfWakanda2(int [][] arr)
        {
            int n=arr.length;
            int m=arr[0].length;
            for(int c=0;c<n;c++)
            {
                if(c%2==0)
                {
                    for(int r=m-1;r>=0;r--)
                    {
                        System.out.println(arr[r][c]);
                    }
                }
                else{
                    for(int r=0;r<m;r++)
                    {
                        System.out.println(arr[r][c]);
                    }
                }
            }
        }
        public static void printStateOfWakanda()
        {
            int m=sc.nextInt();
            int n=sc.nextInt();
            int [][] arr=new int[m][n];
            input(arr);
            stateOfWakanda(arr);
        }
        public static void stateOfWakanda(int [][] arr)
        {
            int m=arr.length;
            int n=arr[0].length;
            for(int c=0;c<n;c++)
            {
                if(c%2==0)
                {
                    for(int r=0;r<m;r++)
                    {
                        System.out.println(arr[r][c]);
                    }

                }
                else{
                    for(int r=m-1;r>=0;r--)
                    {
                        System.out.println(arr[r][c]);
                    }
                }
   
            }
        }
        public static void input(int [][] arr)
        {
            int n=arr.length;
            int m=arr[0].length;
            for(int r=0;r<n;r++)
            {
                for(int c=0;c<m;c++)
                {
                    arr[r][c]=sc.nextInt();
                }
            }

        }
        public static int [][] multipyMatrix(int [][] A,int [][] B)
        {
            int m1=A.length;
            int n1=A[0].length;
            int m2=B.length;
            int n2=B[0].length;
            int [][] C=new int[m1][n2];
            for(int i=0;i<m1;i++)
            {
                for(int j=0;j<n2;j++)
                {
                    int sum=0;
                    for(int k=0;k<m1;k++)
                    {
                        sum+=A[i][k]*B[k][j];
                    }
                    C[i][j]=sum;
                }
               // C[i][j]=sum;
            }
            return C;

        }
        public static void display(int [][] arr)
        {
            int n=arr.length;
            int m=arr[0].length;
            for(int r=0;r<n;r++)
            {
                for(int c=0;c<m;c++)
                {
                    System.out.print(arr[r][c]+"\t");
                }
                System.out.println();
            }
        }
    
}
