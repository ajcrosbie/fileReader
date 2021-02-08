import java.util.ArrayList;

public class Sorter {
    public static void main(String[] args) {
        String in = "File.txt";
        String out = "sorted.txt";
        ArrayList<Integer> nums1 = reader.createList(in);
        ArrayList<Integer> nums = sort(nums1);
        writer.writeIntL(nums, out);

    }

    public static ArrayList<Integer> sort(ArrayList<Integer> nums) {
        boolean c = true;
        int h = 0;
        while (c) {
            int v = 0;
            for (int i = 0; i < nums.size(); i++) {
                if (i == 0) {
                } else if (nums.get(i) < nums.get(i - 1)) {
                    int b = nums.get(i);
                    nums.set(i, nums.get(i - 1));
                    nums.set(i - 1, b);
                } else {
                    v = v + 1;
                    if (v == nums.size() - 2) {
                        h = h + 1;
                        if (h == 10) {
                            c = false;
                        }
                    }
                }
            }
        }
        return nums;
    }

}
