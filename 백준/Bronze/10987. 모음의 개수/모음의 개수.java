import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count=0;
        for(int i=0;i<str.length();i++) {
            char c=str.charAt(i);
            if(c=='a'||c=='e'||c=='o'||c=='i'||c=='u')
                count++;
        }
        System.out.println(count);
    }
}