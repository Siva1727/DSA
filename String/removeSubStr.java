package String ;
import java.lang.*;
public class removeSubStr {
    public static void main(String[] args) {
        String str = "abbcdcazz";
        String str2 = "bcz";
        StringBuilder ans = new StringBuilder();
        // for(int i=0;i<str.length();i++){
        //     char ch = str.charAt(i);
        //     if(str2.indexOf(ch) == -1){
        //         ans.append(ch);
        //     }
            
        // }
        boolean res[] = new boolean[26];
        for(char ch : str2.toCharArray()){
            res[ch-'a'] = true;
        }
        for(char ch : str.toCharArray()){
            if(!res[ch-'a'])ans.append(ch);
        }
        System.out.println(ans);
    }
}
