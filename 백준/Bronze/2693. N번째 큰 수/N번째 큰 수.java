import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        int[] arr=new int[10];
        int[] res=new int[count];
        for(int i=0;i<count;i++){
            for(int j=0;j<10;j++){
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            res[i]=arr[7];
        }
        for(int i=0;i<count;i++){
            System.out.println(res[i]);
        }
    }
}
