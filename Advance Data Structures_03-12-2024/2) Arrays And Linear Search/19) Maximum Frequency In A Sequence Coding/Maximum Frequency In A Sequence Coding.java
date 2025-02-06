class Result {
    static int maxFrequency(int A[], int n) {
        int[] freq = new int[1001];
        for (int i = 0; i < n; i++) {
            freq[A[i]]++;
        }
        int maxFreq = -1;
        int result = Integer.MAX_VALUE;
        for (int i = 0; i <= 1000; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                result = i;
            } else if (freq[i] == maxFreq) {
                result = Math.min(result, i);  
            }
        }
        return result;
    }
}