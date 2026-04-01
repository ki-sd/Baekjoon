import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(isPrime(a))
                count++;
        }
        System.out.println(count);
    }
    public static boolean isPrime(int num){
        if(num<2)
            return false;
        else if(num==2)
            return true;
        else if(num%2==0)
            return false;

        for (int j = 3; j <= Math.sqrt(num); j += 2) {
                if (num % j == 0)
                    return false;
        }
        return true;
    }
}