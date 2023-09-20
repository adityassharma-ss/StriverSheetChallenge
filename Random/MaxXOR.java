public class MaxXOR {

    public static int maxXOR(int[] arr) {
        int maxVal = 0;
        int minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int val = (arr[i] ^ arr[i + 1]) % (10 ^ 9 + 7);
            if (val > maxVal) {
                maxVal = val;
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int minIndex = maxXOR(arr);
        System.out.println(minIndex); // 2
    }
}
