class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap < Integer, Integer> indeces = new HashMap <Integer, Integer>();
        for ( int i = 0; i < nums.length; i++){
            int b = nums [i];
            int a = target - b;
            if (indeces.containsKey (a)){
                return new int[]{indeces.get(a), i};
            }
            indeces.put(b, i);
        }
        return new int[]{};
    }
}
