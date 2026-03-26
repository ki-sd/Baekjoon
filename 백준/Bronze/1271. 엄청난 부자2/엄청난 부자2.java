import java.math.BigInteger;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger m = sc.nextBigInteger();
        BigInteger did = n.divide(m);
        System.out.println(did);
        BigInteger re = n.remainder(m);
        System.out.println(re);
    }
}