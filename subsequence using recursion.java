package arth;
import java.util.*;

public class mult {
    public static ArrayList<List<Integer>> fina = new ArrayList<List<Integer>>();

    static void fun(int in, int[] array, ArrayList<Integer> arr) {
        if (in == 3) {
            fina.add(new ArrayList<>(arr));

			//Change the fina.add(arr) l
			// ine to create a new ArrayList using the contents of arr and add it to fina. 
			// This step is necessary because adding arr directly will add a reference to the same arr object multiple times, 
			// and any modifications to arr will affect all elements in fina.
            return;
        }
        arr.add(array[in]);
        fun(in + 1, array, arr);
        arr.remove(arr.size() - 1);
        fun(in + 1, array, arr);
    }

    public static void main(String args[]) {
        int[] array = {1, 2, 3};
        ArrayList<Integer> arr = new ArrayList<>();
        fun(0, array, arr);
        System.out.println(fina);
    }
}
