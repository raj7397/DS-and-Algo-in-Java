public class 2DArraysQuestions {
    public static void main(string [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] arr=new int[n][m];
        for(int r=0;r<n;r++)
        {
            for(int c=0;c<m;c++)
            {
                arr[r][c]=sc.nextInt();
            }
        }
        display(arr);
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
