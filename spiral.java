import java.util.*;
public class spiral{
    // This is adheesh branch
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=n*n;
        int arr1[][]=new int[n][n];
        int t=0;//top
        int r=arr1.length;//right
        int l=arr1.length;//left
        int b=0;//bottom

    for(int j=0;j<arr1.length;j++){
         t=0;
         arr1[t][j]=k;
         k--;
       //  System.out.println(k);
    }
    for(int i=1;i<arr1.length;i++){
        r=arr1.length-1;
        arr1[i][r]=k;
        k--;
    }
    for(int j=arr1.length-2;j>=0;j--){
        l=arr1.length-1;
        arr1[l][j]=k;
        k--;
    }
    for(int i=arr1.length-2;i>=t+1;i--){
        b=0;
        arr1[i][b]=k;
        k--;
        //System.out.println(k);
    }
    for(int )

// arr1[0][0]=arr[0];
// arr1[0][1]=arr[1];
// arr1[0][2]=arr[2];
// arr1[0][3]=arr[3];

        //printing of matrix
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}