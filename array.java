import java.util.*;
public class array{

 public static void maxsubarray_sum(int numbers[]){
     int currsum=0;
     int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++){
                  currsum=currsum+numbers[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("max sum ="+maxsum);
    }
    public static void sumofsubarray_iszero(int numbers[]){
        int currsum=0;
        int count=0;
        //int maxsum=Integer.MIN_VALUE;
           for(int i=0;i<numbers.length;i++){
               int start=i;
               for(int j=i;j<numbers.length;j++){
                   int end=j;
                   currsum=0;
                   for(int k=start;k<=end;k++){
                     currsum=currsum+numbers[k];
                   }
                  // System.out.println(currsum);
                   if(currsum==0){
                       //System.out.println("true");
                    count++;
                   }
               }
           }
          // System.out.println("max sum ="+maxsum);
          System.out.println(count);
        if(count>=1){
            System.out.println("true");
        }
        else {
             System.out.println("false");
          }
       }
     public static void main(String args[]){
        int numbers[]={4,2,-3,1,6};
      //  maxsubarray_sum(numbers);
      sumofsubarray_iszero(numbers);
   
    }
}