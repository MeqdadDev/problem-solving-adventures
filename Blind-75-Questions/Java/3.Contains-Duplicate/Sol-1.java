class Solution {
    public boolean containsDuplicate(int[] nums) {
        ArrayList<Integer> duplicates = new ArrayList<>();

        for(int i = 0; i<nums.length; i++){
            if (duplicates.contains(nums[i])){
                return true;
            }
            duplicates.add(nums[i]);
        }
        return false;
    }
}