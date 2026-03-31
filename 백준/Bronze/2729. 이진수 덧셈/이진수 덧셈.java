import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        BigInteger[] sum=new BigInteger[count];
        for(int i=0;i<count;i++){
            String num1=sc.next();
            String num2=sc.next();
            BigInteger no1=new BigInteger(num1,2);
            BigInteger no2=new BigInteger(num2,2);
            sum[i]=no1.add(no2);
        }
        for(int i=0;i<count;i++){
            System.out.println(sum[i].toString(2));
        }
    }
}
