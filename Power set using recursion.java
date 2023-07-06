class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> arr=new ArrayList<List<Integer>>();
        ArrayList<Integer> arrl=new ArrayList<Integer>();
        findsubset(arr,arrl,nums,0);
        return arr;

    }
    void findsubset( ArrayList<List<Integer>> arr,  ArrayList<Integer> arrl,int[] nums,int ind){
        if(ind==nums.length){
            arr.add(new ArrayList<Integer>(arrl));
            return;
        }
        arrl.add(nums[ind]);
        findsubset(arr,arrl,nums,ind+1);
        arrl.remove(arrl.size()-1);
        findsubset(arr,arrl,nums,ind+1);
                                              

    }
}