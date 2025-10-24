package twosum;

public class Main {

    public static void main(String[] args) {
        int target = 10;
        int[] nums = new int[]{4,2,3,6,1,10};
        int[] indexSum = solution(target, nums);
        for (int i = 0; i < indexSum.length; i++) {
            System.out.print(indexSum[i] + " ");
        }
        
    }
    public static int[] solution(int target,int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target ) {
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{};
     }
    
}
