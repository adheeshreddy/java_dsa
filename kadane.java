import java.util.*;
public class kadane{
    public static void main(String[] args) {
        int flag=0;
        int arr[]={-2,-3,-4,-1,-2,-5,-3};
        Scanner sc=new Scanner(System.in);
        int arr1[]=new int[arr.length];
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }

        Arrays.sort(arr1);
        if(arr1[arr1.length-1]<0){
          flag=1;
        }
        if(flag==1){
            int sum= arr1[arr1.length-1];
            System.out.println("maximum sub array sum is ="+sum);
        }
        else{

        for(int i=0;i<arr.length;i++){
            
                currsum=currsum+arr[i];
                if(currsum<0){
                    currsum=0;
                }
                if(currsum>maxsum){
                    maxsum=currsum;
                }
            
        }
         System.out.println("maximun sub array sum is="+maxsum);

    }
    }
}
