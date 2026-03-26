import java.util.*;
public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while(true) {
            String str = sc.nextLine();
            if(str.equals("END"))
                break;
            list.add(str);
        }
        for(String s:list) {
            char[] arr=new char[s.length()];
            for(int i=0;i<s.length();i++) {
                arr[i]=s.charAt(s.length()-1-i);
            }
            for(char c:arr) {
                System.out.print(c);
            }
            System.out.println();
        }

    }
}