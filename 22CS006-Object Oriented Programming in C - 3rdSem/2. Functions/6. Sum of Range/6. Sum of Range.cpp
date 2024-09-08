int sumOfRange(int min, int max) {
    if (min > max) {
        return 0;
    }
    int n = max - min + 1;  
    int sum = n * (min + max) / 2; 
    return sum;
}