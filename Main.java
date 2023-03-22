import java.util.*;

public class Main {

public static void main(String args[]){

Scanner sc=new Scanner(System.in);

int count=1;

int n=sc.nextInt();

int a[]=new int[n];

a[0]=sc.nextInt();

for(int i=1;i<n;i++){

a[i]=sc.nextInt();

if(a[i]<a[i-1]){

count++;

}

}

// Write your code here

System.out.println(""+count);

}

}