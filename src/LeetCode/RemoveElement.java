package LeetCode;

/**
 * @Author:MinZhang
 * @Description:
 * @Date:
 **/
public class RemoveElement {
    /**
     * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
     * note : 1 .不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成
     * 2. 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     */

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (nums[i] != val) {
                i++;
            } else if (nums[j] == val) {
                j--;
            } else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return i;
    }


    public static void main(String[] args) {
        int[] nums = {3,2,2,3,7};
        int val = 2;
        int result = RemoveElement.removeElement(nums, val);
        System.out.println(result);
    }


}
