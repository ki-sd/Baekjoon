import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] arr={"","abc","def",
                    "ghi","jkl","mno",
                   "pqrs","tuv","wxyz"};
        int[] keypad=new int[10];
        Map<Character,String> alpha=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<9;i++) {
            int original=sc.nextInt();
            keypad[original]=i+1;
        }
        for(int i=1;i<=9;i++) {
            int targetKey=keypad[i];
            String alphaChunk=arr[i-1];
            for(int j=0;j<alphaChunk.length();j++) {
                char alphabet=alphaChunk.charAt(j);

                String press="";
                for(int k=0;k<=j;k++) {
                    press+=targetKey;
                }
                alpha.put(alphabet,press);
            }
        }
        String input=sc.next();
        String result="";
        for(char c:input.toCharArray()) {
            String currentPress=alpha.get(c);
            if(result.length()>0 && result.charAt(result.length()-1)==currentPress.charAt(0)) {
                result+="#";
            }
            result+=currentPress;
        }
        System.out.println(result);
    }
}