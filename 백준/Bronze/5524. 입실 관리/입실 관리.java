import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        for(int i=0;i<count;i++) {
            String str=sc.next();
            for(int j=0;j<str.length();j++) {
                char c=str.charAt(j);
                if('A'<=c&&c<='Z') {
                    System.out.print((char)(c+32));
                }
                else
                    System.out.print(c);
            }
            System.out.println();
        }
    }
}