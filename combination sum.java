class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> arr =new ArrayList<List<Integer>>();
        int n=candidates.length;
        ArrayList<Integer> arn=new ArrayList<Integer>();
        sum(0,candidates,arr,target,arn);
        return arr;
    }

    public void sum(int ind , int[] array, ArrayList<List<Integer>> arr,int target,ArrayList<Integer> arr2){
        if(ind==array.length){
            if(target==0){
                arr.add(new ArrayList<>(arr2));
            }
            return;
        }
        if(array[ind]<=target){
            arr2.add(array[ind]);
            sum(ind,array,arr,target-array[ind],arr2);
            arr2.remove(arr2.size()-1);

        }

        sum(ind+1,array,arr,target,arr2);

        
    }

    
}