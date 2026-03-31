import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        BigInteger b1=BigInteger.valueOf(num1);
        BigInteger b2=BigInteger.valueOf(num2);
        int gcd=b1.gcd(b2).intValue();
        int lcm=(num1*num2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}