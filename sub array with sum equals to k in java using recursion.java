	package arth;
	import java.util.*;

	public class mult {
		public static ArrayList<List<Integer>> fina = new ArrayList<List<Integer>>();

		static void fun(int in, int[] array, ArrayList<Integer> arr,int s) {
			if (in == 3) {
				if(s==2){
					fina.add(new ArrayList<>(arr));
				}
				

				//Change the fina.add(arr) l
				// ine to create a new ArrayList using the contents of arr and add it to fina. 
				// This step is necessary because adding arr directly will add a reference to the same arr object multiple times, 
				// and any modifications to arr will affect all elements in fina.
				return;
			}
			arr.add(array[in]);
			s=s+array[in];
			fun(in + 1, array, arr,s);
			s=s-array[in];
			arr.remove(arr.size() - 1);
			
			fun(in + 1, array, arr,s);
		}

		public static void main(String args[]) {
			int[] array = {1, 3, 1};
			ArrayList<Integer> arr = new ArrayList<>();
			fun(0, array, arr,0);
			System.out.println(fina);
		}
	}
