class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        if(nums.length > numSet.size()){
            return true;
        }
        return false;

    }
}