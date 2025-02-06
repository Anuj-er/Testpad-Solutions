class Result {
  static int getPairsCount(int arr[], int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : arr) {
            int complement = k - num;
            if (map.containsKey(complement)) {
                res += map.get(complement);
                if (complement == num) {
                    res--;  
                }
            }
        }
        return res / 2;
  }
}