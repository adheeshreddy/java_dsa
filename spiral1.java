import java.util.*;
public class spiral1{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=n*n;
        int arr[][]=new int[n][n];
        int sr=0;
        int sc=0;
        int er=n-1;
        int ec=n-1;
        while(sr<=er && sc<=ec){
            for(int j=sc;j<=ec;j++){
              //  System.out.println("(sr,j)=("+sr+","+j+")");
               //                 System.out.println("k="+k);

                arr[sr][j]=k;
             //   System.out.println("arr["+sr+"]["+j+"]="+arr[sr][j]);
                k--;
                
            }
            for(int i=sr+1;i<=er;i++){
                arr[i][ec]=k;
                k--;
            }
            for(int j=ec-1;j>=sc;j--){
                arr[er][j]=k;
                k--;
            }
            for(int i=er-1;i>=sr+1;i--){
                arr[i][sc]=k;
                k--;
            }
            sr++;
             sc++;
            er--;
            ec--;
        }
        for(int i=0;i<arr.length;i++){
        //    for(int j=0;j<arr.length;j++)
                System.out.print(Arrays.toString(arr[i]));
            
            
        }
        
    }
}
