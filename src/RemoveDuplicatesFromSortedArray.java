import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("How many?:");
        int n = scn.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter:");
            nums[i] = scn.nextInt();
        }

        int[] k = removeDuplicatesFromArray(nums);
        System.out.print(Arrays.toString(k));
    }

    public static int[] removeDuplicatesFromArray(int[] nums){
        int k = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[k - 1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return Arrays.copyOf(nums, k);
    }
}
