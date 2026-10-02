import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("How many elemets:");
        int n = scn.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter:");
            nums[i] = scn.nextInt();
        }

        System.out.print("Val:");
        int val = scn.nextInt();

        int k = removeElement(nums, val);
        System.out.println("k:" + k);
    }

    public static int removeElement(int[] nums, int val){
        int k =0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

}


