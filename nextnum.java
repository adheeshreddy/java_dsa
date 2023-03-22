import java.util.*;
public class nextnum{
    public static void main(String[] args) {
        String n2="53686853421";
        String n = "5368365421";
        //to convert the given string into array
        char[] arr=n.toCharArray();
        // System.out.println(Arrays.toString(arr));
        // for(int i=0;i<arr.length;i++){
        // System.out.print(arr[i]+" ");
        // }
        // System.out.println();

        //checking for 3 conditions

        //condition 1 
        //copying elements into a new array
        char arr1[]=new char[arr.length];
         for(int i=0;i<arr.length;i++){
             arr1[i]=arr[i];
        }
                   Arrays.sort(arr1);
                   //reversing the sorted array to get in descending order
                   
        char temp1;
          int start=0;
          int end=arr.length-1;
        while (start < end)
        {
            temp1 = arr1[start];
            arr1[start] = arr1[end];
            arr1[end] = temp1;
            start++;
            end--;
        }
        // //if the given numbers are all in descending order
         int desele=0;
         for(int x=0;x<arr.length;x++){
            if(arr[x]==arr1[x]){
             desele++;
             }
         }
         if(desele==arr.length){
            System.out.println("not possible");
        }

else{

          int flag=0;
          int s1=0;//swapped indexes
          int s2=0;//swapped indexes

        for(int i=arr.length-1;i>=0;i--){
            for(int k=i-1;k>=0;k--){
            if(arr[k]<arr[i]){
                char temp=arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                flag=1;
                s1=i;s2=k;
            }
            if(flag==1){
                break;
            }
        }
        if(flag==1){
            break;
        }
        }


        if((s1-s2)==1){
            Arrays.sort(arr,s2+1,arr.length);
        System.out.println(Arrays.toString(arr));
        }


        
        else{
            System.out.println("case 2");
            //in built function Arrays.sort(array name,starting index,ending index [non inclusicve])
            Arrays.sort(arr,s2+1,arr.length);
           System.out.println(Arrays.toString(arr)); 
        }
    }

    }
}
