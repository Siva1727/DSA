package String;
import java.lang.*;
import java.util.Arrays;
public class movelast {
    public static void main(String[] args) {
        String str = "s#i#v#a#";
        char arr[] = str.toCharArray();
        int s=arr.length-1;
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] != '#'){
                char temp = arr[i];
                arr[i] = arr[s];
                arr[s] = temp;
                s--;
            }
        }
        System.out.print(Arrays.toString(arr));

    }
}
