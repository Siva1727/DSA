<<<<<<< HEAD
package DP;

public class Robber_op {
    public static void main(String[] args) {
        int[]nums = {1,2,3,1};
        int prev = nums[0];
        int prev2 = 0;
        for(int i=1;i<nums.length;i++){
            int take = nums[i];
            if(i > 1){
                take+=prev2;
            }
            int not =  0 + prev;
            int cur = Math.max(take,not);
            prev2 = prev;
            prev = cur;
        }
        System.out.println(prev);
    }
}
=======
package DP;

public class Robber_op {
    public static void main(String[] args) {
        int[]nums = {1,2,3,1};
        int prev = nums[0];
        int prev2 = 0;
        for(int i=1;i<nums.length;i++){
            int take = nums[i];
            if(i > 1){
                take+=prev2;
            }
            int not =  0 + prev;
            int cur = Math.max(take,not);
            prev2 = prev;
            prev = cur;
        }
        System.out.println(prev);
    }
}
>>>>>>> 01ed7d3 (commit stack and queue)
