import java.util.Arrays;
import java.util.Scanner;

class Merge_sorted_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Introduceti un nr:");
        int m = scn.nextInt();
        System.out.println("Introduceti alt nr:");
        int n = scn.nextInt();


        int[] nums1 =new int[m + n];
        System.out.println("Elementele din nums1:");
        for(int i = 0; i < m; i++){
            nums1[i] = scn.nextInt();
        }

        int[] nums2 = new int[n];
        System.out.println("Elementele din nums2:");
        for(int j = 0; j < n; j++){
            nums2[j] = scn.nextInt();
        }

        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = n + m - 1;

        while(j >= 0){
            if(i >= 0 && nums1[i] >= nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }else{
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
    }
}
