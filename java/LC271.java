import java.util.HashSet;

class Test1 {
    public boolean containsDuplicate(int[] nums){ // First approach using HashSet 
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }     return false;
    }
}

class Test2 {
    public boolean containsDuplicate(int[] nums){ // Second approach using sorting
        // Time Complexity: O(n log n)
        // Space Complexity: O(1) or O(n) depending on the sorting algorithm used
        java.util.Arrays.sort(nums);

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                return true;
            }
        }
        return false;
    }
}

class Test3{
    public boolean containsDuplicate(int[] nums){ // Third approach using brute force
        // Time Complexity: O(n^2)
        // Space Complexity: O(1)
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}

public class LC271 {
    public static void main(String[] args) {
        Test1 test = new Test1();
        int[] nums = {1, 2, 3, 1};
        System.out.println(test.containsDuplicate(nums)); // Output: true
    }
}