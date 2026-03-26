import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        for(int i=0;i<count;i++){
            String str=sc.next();
            char first=str.charAt(0);
            char last=str.charAt(str.length()-1);
            System.out.print(first);
            System.out.print(last+"\n");
        }

    }

}