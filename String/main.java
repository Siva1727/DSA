package String;

import java.util.LinkedHashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        String str= "Hello";
        Set<Character> set = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            set.add(ch);
        }
        for(char ch : set){
            System.out.print(ch);
        }
    }
}