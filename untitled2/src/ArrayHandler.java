public class ArrayHandler {
    public static void main(String[] args) {
        int[] array = new int[]{-5, 4, 1, 2, 3, 6, 10};
        System.out.println(maxFunction(array));
        System.out.println(minFunction(array));
    }
    public static int maxFunction(int[] arr) {
        int max = arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int minFunction(int[] arr) {
        int min = arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
