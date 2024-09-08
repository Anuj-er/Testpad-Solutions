int gcd(int i, int j) {
    while (j != 0) {
        int temp = j;
        j = i % j;
        i = temp;
    }
    return i;
}