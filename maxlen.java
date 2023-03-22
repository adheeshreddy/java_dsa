import java.util.*;
 public class maxlen{
    public static void main(String args[]) {
        int arr[]={5,3,10,12,25,20};
       // Arrays.sort(arr);
        int maxcount=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
           int  x=i;
            int count=1;
            
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]%arr[x]==0){
                    System.out.println(arr[j]+","+arr[x]);
                    x=j;
                    count++;
                    System.out.println(count);
                }
                if(count>maxcount){
                    maxcount=count;
                }
            }
        }
        System.out.println(maxcount);
        
    }
 }