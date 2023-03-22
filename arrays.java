import java.util.*;
public class arrays{
    public static int linear_search(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key)
            {
                return i;
            }
        }
        return -1;

    }
    public static int largestof_array(int numbers[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>=max)
            {
                max=numbers[i];
            }
        }
        return max;
    }
    public static int binary_search(int numbers[],int key){//only for sorted array elements
        int start=0;
        int end=(numbers.length)-1;
        while(start<=end){
            int mid=(start+end)/2;
            //comparisons
            if(numbers[mid]==key){//found
                return mid;
            }
            if(numbers[mid]<key){
                //right condition
                start=mid+1;
            }
            else{
                //left condition
                end=mid-1; 
            }
            
        }
        return -1;
    }

    //reverse using brute force
    public static void reverse(int numbers[]){
        int first=0,last=numbers.length-1;
         while(first<last){
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++;
            last--;
         }
    }

    //reverse using arraylist
    static void reversee(Integer myArray[]) 
    { 
        Collections.reverse(Arrays.asList(myArray)); 
        System.out.println("Reversed Array:" + Arrays.asList(myArray)); 
    } 
    public static void pairs_print(int numbers[]){
        int totalpairs=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+numbers[i]+","+numbers[j]+") ");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.print("total pairs :"+totalpairs);
    }

 
    public static void arraymanipulation(){
        int[] n = {1,2,3,4,5,6,7};
        int[] e = new int[7];
       // n = {1,2,3,4,5,6};
        int x = 0;
        int y = n.length-1;
        for(int i = 0; i < n.length-1;i = i + 2){
                e[i] = n[x];
                x = x + 1;
                e[i+1] = n[y];
                y = y - 1;
                
        }
        if(n.length%2!=0){
            e[n.length-1] = n[x];
        }
        System.out.println(Arrays.toString(e));
    

    }
    public static void subarrays_print(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }
   
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
             System.out.println("count ="+count);
           if(count>=1){
               System.out.println("true");
           }
           else {
                System.out.println("false");
             }
          }
          public static void important_pairs(int numbers[]){
            int count=0;
            for(int i=0;i<numbers.length;i++){
                for(int j=i+1;j<numbers.length;j++){
                    if((i<j) && (numbers[i]>2*numbers[j])){
                        count++;
                    }
                }
            }
            System.out.println("count ="+count);

          }
        //   public static void maxlengthof_dividingsubarray(int arr[]){
        //     int arr1[];
        //     for(int i=0;i<arr.length;i++){
        //             if(arr[i+1] % arr[i]==0){

        //             }
        //     }


        //  }

        public static void rotatematrix(int arr[][]){
           int  n=3;
           //transpose
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
            //swapping 1
            // for(int i=0;i<n;i++){
            //     for(int j=0;j<n/2;j++){
            //         int temp1=arr[i][j];
            //         arr[i][j]=arr[i][n-j-1];
            //         arr[i][n-j-1]=temp1;
            //     }
            // }

            //swapping 2
            for(int i=0;i<n;i++){
                int first=0;
                int last=arr.length-1;
                while(first<last){
                    int temp1=arr[i][last];
                    arr[i][last]=arr[i][first];
                    arr[i][first]=temp1;
                    first++;
                    last--;
                }
            }
            //printing matrix
          //  System.out.println(Arrays.toString(arr[0]));
           for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
             }
            System.out.println();
          }
        }
    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
       //rotatematrix(arr);
      //sumofsubarray_zero(numbers);
    //   for(int i=1;i<2*arr[0].length-1;i++){
    //     int j=0;
    //     int k=1;
    //     while(j!=k){
    //         k = i - j;
    //         System.out.println(arr[j][k]);
    //         System.out.println(arr[k][j]);
    //         if(j==k){
    //             break;
    //         }
    //         j++;
    //     }
    //   }
    for(int k=0;k<=2*(arr.length-1);k++){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i+j==k){
                    System.out.print(arr[i][j]);
                }
            }
        }
        System.out.println();
    }
    }
}
    
