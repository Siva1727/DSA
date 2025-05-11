<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

public class palindromePartition {
    public static void main(String[] args) {
        String s = "aabb";
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        solve(0,s,ans,list);
        System.out.print(ans);

    }
    static void solve(int ind,String s ,List<List<String>> ans, List<String> list){
        if(ind == s.length()){
            ans.add(new ArrayList(list));
            return ;
        }
        for(int i = ind;i<s.length();i++){
            if(palindrome(s,ind,i)){
                list.add(s.substring(ind , i+1));
                solve(i+1,s,ans,list);
                list.remove(list.size()-1);
            }
        }

    }
    static boolean palindrome(String s , int left , int right){
        while(left <= right){
            if(s.charAt(left++) != s.charAt(right--))return false;
        }
        return true;
    }
}
=======
import java.util.ArrayList;
import java.util.List;

public class palindromePartition {
    public static void main(String[] args) {
        String s = "aabb";
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        solve(0,s,ans,list);
        System.out.print(ans);

    }
    static void solve(int ind,String s ,List<List<String>> ans, List<String> list){
        if(ind == s.length()){
            ans.add(new ArrayList(list));
            return ;
        }
        for(int i = ind;i<s.length();i++){
            if(palindrome(s,ind,i)){
                list.add(s.substring(ind , i+1));
                solve(i+1,s,ans,list);
                list.remove(list.size()-1);
            }
        }

    }
    static boolean palindrome(String s , int left , int right){
        while(left <= right){
            if(s.charAt(left++) != s.charAt(right--))return false;
        }
        return true;
    }
}
>>>>>>> 01ed7d3 (commit stack and queue)
