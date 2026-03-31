import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        String[] str=new String[count];
        for(int i=0;i<count;i++){
            str[i]=sc.next();
        }
        StringBuilder res=new StringBuilder();
        int length=str[0].length();
        for(int i=0;i<length;i++){
            char target=str[0].charAt(i);
            boolean isSame=true;
            for(int j=1;j<str.length;j++){
                if(str[j].charAt(i)!=target){
                    isSame=false;
                    break;
                }
            }
            if(isSame){
                res.append(target);
            }else{
                res.append("?");
            }
        }
        System.out.println(res);
    }
}