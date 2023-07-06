class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
     
        ArrayList<List<Integer>> arr =new ArrayList<List<Integer>>();
        int n=candidates.length;
        ArrayList<Integer> arn=new ArrayList<Integer>();
        compute(0,candidates,arr,target,arn);
      
        return arr;
    }

    	void compute(int ind, int[] arr,ArrayList<List<Integer>> ans, int target, List<Integer> ds) {
		 
			 if(target==0) {
				 
				 ans.add(new ArrayList<Integer>(ds));
                  return;
			 }
			
		 
         for(int i=ind;i<arr.length;i++){
             if(i>ind && arr[i]==arr[i-1]){
                continue;

            }
            if(arr[i]>target){
                break;
            }
             ds.add(arr[i]);
			 compute(i+1, arr, ans, target-arr[i], ds);
			 ds.remove(ds.size()-1);

         }
		
	}
    
}