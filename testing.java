
//Please accept the inputs from the console and print the output import java.io.*;
import java.util.*;
public class testing
{
public static void main(String[] args) { Scanner in = new Scanner(System.in);
//int arr[]=new int[5];
int arr[] = {2,2,4,1,5};
Arrays.sort(arr);

Set<Integer> s = new HashSet<>();
for(int x: arr){
    s.add(x);
}
int a[] = new int[s.size()];
int cnt = 0;
for(int x: s){
    a[cnt++] = x;
}

System.out.println(Arrays.toString(a));
for(int i = 0;i<a.length;i++){
    if(a.length-1-i==a[i]){
        System.out.println(a[i]);
    }
    

}







System.out.println();
System.out.println();

int flag=0;
for(int f=0;f<5;f++){
int count=0;
for(int l=0;l<arr.length;l++){
if(arr[f]<arr[l]){
System.out.print(arr[f]);

System.out.print(arr[l]);
System.out.println();
count++;
}
}
if(arr[f] ==count){ flag=1;
    System.out.println("*");
}
}
}
}