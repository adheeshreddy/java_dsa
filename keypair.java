import java.util.*;
public class keypair{
    public static void main(String args[]){
        // key value pair using hashset in which we have got tc:o(n) sc:o(n)
        int x=16;
        int arr[]={1,4,45,6,8};
     HashSet<Integer> hs=new HashSet<Integer>();
     for(int i=0;i<arr.length;i++){
         hs.add(arr[i]);
     }
     System.out.println(hs);
     int count=0;
     for(int i=0;i<arr.length;i++){
        if(hs.contains(x-arr[i])){
             count++;
        }
     }
     if(count>=1){
     System.out.println("sum is possible");
     }
     else{
        System.out.println("sum is not possible");
     }
     
}
}