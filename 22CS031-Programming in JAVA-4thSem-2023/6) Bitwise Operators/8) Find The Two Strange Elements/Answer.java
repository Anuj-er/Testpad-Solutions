class Result {
    static void printStrangeElements(int[] arr, int n) {
        int xor_all = 0;
        for (int num : arr) {
            xor_all ^= num;
        }
        int rightmost_set_bit = xor_all & -xor_all;
        int x = 0, y = 0;
        for (int num : arr) {
            if ((num & rightmost_set_bit) != 0) {
                x ^= num;
            } else {
                y ^= num;
            }
        }
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
        System.out.println(x + " " + y);
    }
}