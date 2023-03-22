
//Please accept the inputs from the console and print the output import java.io.*;
import java.util.*;
public class maxPerm
{
public static void main(String[] args) { Scanner in = new Scanner(System.in);

int arr[] = {1};
int k = 1;



Map<Integer,Integer> m = new HashMap<>();
Set<Integer> s = new HashSet<>();
for(int x: arr){
    s.add(x);
    m.put(x,0);
}
for(int x: arr){
    m.put(x,m.get(x)+1);
}


System.out.println(m.keySet());
System.out.println(m.values());
int[] num = new int[m.keySet().size()];
int[] feq = new int[m.keySet().size()];
int count = 0;
for(int x: m.keySet()){
    num[count++] = x;
}
count = 0;
for(int y: m.values()){
    feq[count++] = y;
}
for(int i=0;i<num.length-1;i++){
    for(int j=0;j<num.length-1-i;j++){
        if(feq[j]<feq[j+1]){
            int t1 = num[j];
            num[j] = num[j+1];
            num[j+1] = t1;
            int t2 = feq[j];
            feq[j] = feq[j+1];
            feq[j+1] = t2;
        }
    }
}

for(int i=0;i<k;i++){
    System.out.print(num[i]+" ");
}


//System.out.println(s);

 
}
}