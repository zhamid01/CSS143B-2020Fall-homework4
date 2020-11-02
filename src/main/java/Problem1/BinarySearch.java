package Problem1;

public class BinarySearch {
    // This is to be done recursively
    // Do not change signature (return type, function name, parameter types)
    // Add a helper function for recursion calls
    public static int binarySearch(int[] data, int target) {
        if (data == null) {
            return -1;
        }
        else {
            return search(data, target, 0, data.length - 1);
        }
    }

    public static int search(int[] data, int target, int start, int last) {
        if (last >= start) {
            int middle = start + (last - start) / 2;
            if (data[middle] == target) {
                return middle;
            }
            if (target < data[middle]) {
                return search(data, target, 0, middle - 1);
            }
            return search(data, target, middle + 1, last);
        }
        return -1;
    }
}
