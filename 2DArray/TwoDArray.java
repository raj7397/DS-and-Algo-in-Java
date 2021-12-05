import java.util.Scanner;
public class TwoDArray {
        public static Scanner sc=new Scanner(System.in);
    
        public static void main(String [] args)
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
